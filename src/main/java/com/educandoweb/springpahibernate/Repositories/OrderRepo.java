package com.educandoweb.springpahibernate.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springpahibernate.entities.Order;


public interface OrderRepo extends JpaRepository<Order, Long> {

    
}
