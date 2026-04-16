package com.educandoweb.springpahibernate.Repositories;

import com.educandoweb.springpahibernate.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    
}
