package com.educandoweb.springpahibernate.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.springpahibernate.Repositories.CategoryRepository;
import com.educandoweb.springpahibernate.entities.Category;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository CategoryRepository;


    public List<Category> findAll(){
        return CategoryRepository.findAll();
    }

    public Category findById(Long id){
         Optional<Category> user = CategoryRepository.findById(id);

         return user.get();
    }
}
