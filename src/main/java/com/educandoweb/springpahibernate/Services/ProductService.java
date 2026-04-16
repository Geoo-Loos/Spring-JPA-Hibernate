package com.educandoweb.springpahibernate.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.springpahibernate.Repositories.ProductRepository;
import com.educandoweb.springpahibernate.entities.Product;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepo;


    public List<Product> findAll(){
        return productRepo.findAll();
    }

    public Product findById(Long id){
         Optional<Product> product = productRepo.findById(id);

         return product.get();
    }
}
