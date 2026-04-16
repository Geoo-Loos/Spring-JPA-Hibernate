package com.educandoweb.springpahibernate.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.springpahibernate.Repositories.UserRepo;
import com.educandoweb.springpahibernate.entities.User;

@Service
public class UserService {
    
    @Autowired
    private UserRepo userRepo;


    public List<User> findAll(){
        return userRepo.findAll();
    }

    public User findById(Long id){
         Optional<User> user = userRepo.findById(id);

         return user.get();
    }
}
