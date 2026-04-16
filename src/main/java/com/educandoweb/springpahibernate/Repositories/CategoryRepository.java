package com.educandoweb.springpahibernate.Repositories;

import com.educandoweb.springpahibernate.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    
}
