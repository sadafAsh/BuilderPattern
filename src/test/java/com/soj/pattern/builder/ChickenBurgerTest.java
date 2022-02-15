package com.soj.pattern.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenBurgerTest {

    @Test
    void testToGetNameOfChickenBurger() {
        Burger chickenBurger=new ChickenBurger();
        String expected="Chicken Burger";
        Assertions.assertEquals(expected,chickenBurger.name());
    }

    @Test
    void testToGetPriceChickenBurger() {
        Burger chickenBurger=new ChickenBurger();
        double expected=30.0;
        Assertions.assertEquals(expected,chickenBurger.price());
    }

    @Test
    void testToGetPackagingChickenBurger() {
        Item item =new ChickenBurger();
        Burger chickenBurger=new ChickenBurger();
        chickenBurger.packing();
        Assertions.assertTrue(chickenBurger instanceof Item);
    }}
