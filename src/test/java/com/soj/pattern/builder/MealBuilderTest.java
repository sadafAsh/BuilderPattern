package com.soj.pattern.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class MealBuilderTest {

    @Test
    void testToPrepareVegMeal() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal meal = mealBuilder.prepareVegMeal();
        List<Boolean> vegBurger = meal.getItems().stream().map(x -> x instanceof VegBurger).collect(Collectors.toList());


        Assertions.assertTrue(vegBurger.size() >= 1);
    }

    @Test
    void prepareNonVegMeal() {

        MealBuilder mealBuilder = new MealBuilder();

        Meal meal = mealBuilder.prepareNonVegMeal();
        List<Boolean> nonVegBurger = meal.getItems().stream().map(x -> x instanceof ChickenBurger).collect(Collectors.toList());
        Assertions.assertTrue(nonVegBurger.size() >= 1);
    }
}
//gradle sonarqube
//        -Dsonar.projectKey=BuilderPattern
//        -Dsonar.host.url=http://localhost:9000
//        -Dsonar.login=8934b50c504b3affd56434a98fd991a3c0837b17
