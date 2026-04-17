package com.educandoweb.springpahibernate.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springpahibernate.entities.OrderItem;
import com.educandoweb.springpahibernate.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
    
}
