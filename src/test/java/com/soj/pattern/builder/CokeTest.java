package com.soj.pattern.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CokeTest {
    @Test
    void testToGetNameOfCoke() {
        ColdDrink coldDrink=new Coke();
        String expected="Coke";
        Assertions.assertEquals(expected,coldDrink.name());
    }

    @Test
    void testToGetPriceCoke() {
        ColdDrink coldDrink=new Coke();
        double expected=20.0;
        Assertions.assertEquals(expected,coldDrink.price());
    }

    @Test
    void testToGetPackagingCoke() {
        Item item =new Coke();
        Coke coldDrink=new Coke();
        Bottle bottle=new Bottle();
        coldDrink.packing();
        Assertions.assertTrue(coldDrink instanceof Item);

    }
}