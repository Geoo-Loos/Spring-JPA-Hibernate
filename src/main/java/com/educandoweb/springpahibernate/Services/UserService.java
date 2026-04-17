package com.educandoweb.springpahibernate.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.educandoweb.springpahibernate.Repositories.UserRepo;
import com.educandoweb.springpahibernate.Services.Exception.DataBaseException;
import com.educandoweb.springpahibernate.Services.Exception.ResouseNotFoundException;
import com.educandoweb.springpahibernate.entities.User;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
    
    @Autowired
    private UserRepo userRepo;


    public List<User> findAll(){
        return userRepo.findAll();
    }

    public User findById(Long id){
         Optional<User> user = userRepo.findById(id);

         return user.orElseThrow(() -> new ResouseNotFoundException("User not found. Id: " + id));
    }

    public User insert(User obj){
        return userRepo.save(obj);
    }

    public void delete(Long id){
        try{
            userRepo.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResouseNotFoundException("Error deleting user with id: " + id);
        } catch(DataIntegrityViolationException e){
            throw new DataBaseException("Error deleting user with id: " + id + ". " + e.getMessage());
        }
       
    }

    public User update(Long id, User obj){
        try {
            User entity = userRepo.getReferenceById(id);
            updateData(entity, obj);
            return userRepo.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResouseNotFoundException("Error updating user with id: " + id);
        }
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
