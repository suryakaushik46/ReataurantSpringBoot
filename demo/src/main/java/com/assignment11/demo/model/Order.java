package com.assignment11.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String restaurantName;
    private List<String> items;
//    private List<Items> itemsList;
    private int cost;

//     private Restaurant restaurant;

     public Order(){

     }

    public Order(String restaurantName, List<String> items, int cost) {
        this.restaurantName = restaurantName;
        this.items = items;
        this.cost = cost;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}