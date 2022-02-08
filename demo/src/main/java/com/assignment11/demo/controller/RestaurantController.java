package com.assignment11.demo.controller;

import com.assignment11.demo.model.Items;
import com.assignment11.demo.model.Restaurant;
import com.assignment11.demo.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;
    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurants(){

        return restaurantService.getRestaurants();
    }
    @GetMapping("/restaurants/{id}/items")
    public List<Items> getItems(@PathVariable String id){
        return restaurantService.getItems(id);
    }
    @PostMapping("/restaurants/add")
    public void addRestaurant(@RequestBody Restaurant restaurant){
//        System.out.println(restaurant.toString());
           restaurantService.addRestaurant(restaurant);
    }
    @PostMapping("/restaurants/{name}/addItem")
    public void addItem(@RequestBody Items items,@PathVariable String name){
        restaurantService.addItem(items,name);
    }

}
