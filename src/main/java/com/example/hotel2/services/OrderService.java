package com.example.hotel2.services;

import com.example.hotel2.entities.Department;
import com.example.hotel2.entities.Order;
import com.example.hotel2.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    public OrderRepo repo;

    public List<Order> viewAll(){
        return repo.findAll();
    }

    public Order create(Order order){return repo.save(order);}
}
