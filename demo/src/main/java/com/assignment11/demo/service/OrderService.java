package com.assignment11.demo.service;

import com.assignment11.demo.model.Items;
import com.assignment11.demo.model.Order;
import com.assignment11.demo.model.OrderRequest;
import com.assignment11.demo.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private RestaurantService restaurantService;

    private List<String> items=new ArrayList<>(Arrays.asList("noodles","dosa"));
    private List<Order> orderList=new ArrayList<>(Arrays.asList(new Order("indian",items,500)));
    public void addOrderItem(OrderRequest orderRequest){
        String name=orderRequest.getRestaurantName();
        Restaurant restaurant = null;
        for(Restaurant r:restaurantService.getRestaurants()){
                  if(name.equals(r.getName())){
                      restaurant=r;
                      break;
                  }
        }
        int cost=0;
        for(String s:orderRequest.getItems()){
            if(restaurant!=null) {
                for (Items it : restaurant.getItemsList()) {
                        if(s.equals(it.getName())){
                            cost+=it.getCost();
                        }
                }
            }
        }
        Order order=new Order(name,orderRequest.getItems(),cost);
        orderList.add(order);

    }
   public List<Order> getOrderList(){
        return orderList;
   }

}
