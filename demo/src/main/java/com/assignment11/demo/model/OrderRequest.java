package com.assignment11.demo.model;

import java.util.List;

public class OrderRequest {
    private String restaurantName;
    private List<String> items;

    public OrderRequest(String restaurantName, List<String> items) {
        this.restaurantName = restaurantName;
        this.items = items;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "restaurantName='" + restaurantName + '\'' +
                ", items=" + items +
                '}';
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
}