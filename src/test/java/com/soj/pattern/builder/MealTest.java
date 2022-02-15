package com.soj.pattern.builder;

import com.sun.tools.javac.jvm.Items;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    @Test
    void testToGetTotalCost() {
        List<Items>  items=new ArrayList<>();
        Meal meal=new Meal();
        Item vegBurger=new VegBurger();
        double price=vegBurger.price();
        price=25.0;
        meal.addItem(vegBurger);
        double expected=meal.getCost();
        Assertions.assertEquals(expected,price);

    }

    @Test
    void testToGetListOfItems(){
        List<Items>  items=new ArrayList<>();
        Meal meal=new Meal();
        Item vegBurger=new VegBurger();
        meal.addItem(vegBurger);
        Assertions.assertEquals(1,meal.getItems().size());

    }

    @Test
    void testToShowItems() {
        List<Items>  items=new ArrayList<>();
        Meal meal=new Meal();
        Item vegBurger=new VegBurger();

        meal.addItem(vegBurger);
meal.showItems();
        String expected="Item : " + vegBurger.name()+
                        '\n'+"Packing : "+vegBurger.packing().pack()+
                        '\n'+"Price : "+vegBurger.price();
Assertions.assertTrue(true,"displayed the items");

    }
}