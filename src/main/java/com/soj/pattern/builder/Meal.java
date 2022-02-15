package com.soj.pattern.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    static final Logger logger= LogManager.getLogger(Meal.class.getName());

    private List<Item> items=new ArrayList<>();

    public void addItem(Item item){
        items.add(item);

    }
    public double getCost(){
        double cost=0.0;
        for(Item item:items){
            cost+=item.price();
        }return cost;
    }

    public List<Item> getItems(){
        return items;
    }
    public void   showItems(){
        for(Item item:items){
            String name=item.name();
            String pack=item.packing().pack();
            double price=item.price();
            logger.debug("Item : {} ",name);
            logger.debug("Packing : {} ",pack);
            logger.debug("Price : {}",price);
    }
    }
}
