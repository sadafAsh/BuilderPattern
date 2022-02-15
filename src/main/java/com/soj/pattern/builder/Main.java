package com.soj.pattern.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args){

        MealBuilder mealBuilder=new MealBuilder();
       Meal vegMeal=mealBuilder.prepareVegMeal();
        logger.debug("Veg Meal");
        vegMeal.showItems();
       logger.debug( "Total Cost : {}",vegMeal.getCost());


logger.info('\n');
        Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
        logger.debug("NonVeg Meal");
        nonVegMeal.showItems();
        logger.debug( "Total Cost : {}",nonVegMeal.getCost());


    }
}
