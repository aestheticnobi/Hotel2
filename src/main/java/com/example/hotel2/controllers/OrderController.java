package com.example.hotel2.controllers;

import com.example.hotel2.entities.Order;
import com.example.hotel2.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/order")
@Controller
public class OrderController {

    @Autowired
    public OrderService service;

    @GetMapping("/order1")
    public  String GetOrder(Model model){
        model.addAttribute("order", new Order());
        return"order_reg";
    }

    @PostMapping("/return")
    public String OrderForm(Order order, Model model){
        service.create(order);
        return"redirect:/order/view";
    }

    @GetMapping("/view")
    public String view(Model model){
        model.addAttribute( "order" ,service.viewAll());
        return"order_view";
    }
}
