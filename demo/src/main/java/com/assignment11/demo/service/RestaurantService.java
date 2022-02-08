package com.assignment11.demo.service;

import com.assignment11.demo.model.Items;
import com.assignment11.demo.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RestaurantService {
     List<Restaurant> restaurants=new ArrayList<Restaurant>(Arrays.asList(new Restaurant(1,"fromOld"),new Restaurant(2,"justSigned")));
     public List<Restaurant> getRestaurants(){
        restaurants.get(0).setItemsList(itemsList);
       return restaurants;
     }
     List<Items> itemsList=new ArrayList<>(Arrays.asList(new Items(1,"noodles",200),new Items(2,"dosa",300)));
     public List<Items> getItems(String id){
         for(Restaurant r:restaurants){
             if(id.equals(r.getName())){
                 return r.getItemsList();
             }
         }
         return null;
     }

     public  void addRestaurant(Restaurant restaurant){
          restaurants.add(restaurant);
     }

     public void addItem(Items items,String name){
         for(Restaurant r: restaurants){
             if(name.equals(r.getName())){
                 if(r.getItemsList()!=null){
                    r.getItemsList().add(items);
                 }else{
                     List<Items> li=new ArrayList<>();
                     li.add(items);
                     r.setItemsList(li);
                 }
             }
         }
     }

   public Restaurant getRestaurant(String name){
        for(Restaurant r:restaurants){
            if(name.equals(r.getName())){
                return r;
            }
        }
        return null;
   }
}
