package com.assignment11.demo.controller;

import com.assignment11.demo.model.Order;
import com.assignment11.demo.model.OrderRequest;
import com.assignment11.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/orders")
    public List<Order> getOrders(){
        return orderService.getOrderList();
    }
    @PostMapping("/orders/addOrder")
    public void addOrder(@RequestBody OrderRequest orderRequest){
           orderService.addOrderItem(orderRequest);
    }
}

