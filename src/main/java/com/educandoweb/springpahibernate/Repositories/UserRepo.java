package com.educandoweb.springpahibernate.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.educandoweb.springpahibernate.entities.User;


public interface UserRepo extends JpaRepository<User, Long> {

    
}
