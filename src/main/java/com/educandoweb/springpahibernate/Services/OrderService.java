package com.educandoweb.springpahibernate.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.springpahibernate.Repositories.OrderRepo;
import com.educandoweb.springpahibernate.entities.Order;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepo orderRepo;


    public List<Order> findAll(){
        return orderRepo.findAll();
    }

    public Order findById(Long id){
         Optional<Order> order = orderRepo.findById(id);

         return order.get();
    }
}
