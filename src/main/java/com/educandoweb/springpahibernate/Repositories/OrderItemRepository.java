package com.educandoweb.springpahibernate.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springpahibernate.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
