package com.soj.pattern.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VegBurgerTest {

    @Test
    void testToGetNameOfVegBurger() {
        VegBurger vegBurger=new VegBurger();
        String expected="Veg Burger";
        Assertions.assertEquals(expected,vegBurger.name());
    }

    @Test
    void testToGetPriceVegBurger() {
        VegBurger vegBurger=new VegBurger();
        double expected=25.0;
        Assertions.assertEquals(expected,vegBurger.price());
    }

    @Test
    void testToGetPackagingVegBurger() {
        Wrapper wrapper=new Wrapper();
        Burger vegBurger=new VegBurger();
     vegBurger.packing();
        Assertions.assertTrue(wrapper instanceof Wrapper );
}}