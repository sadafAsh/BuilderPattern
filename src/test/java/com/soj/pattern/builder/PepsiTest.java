package com.soj.pattern.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PepsiTest {

    @Test
    void testToGetNameOfPepsi() {
        ColdDrink coldDrink=new Pepsi();
        String expected="Pepsi";
        Assertions.assertEquals(expected,coldDrink.name());
    }

    @Test
    void testToGetPriceCoke() {
        ColdDrink coldDrink=new Pepsi();
        double expected=25.5;
        Assertions.assertEquals(expected,coldDrink.price());
    }

    @Test
    void testToGetPackagingCoke() {
        Item item =new Pepsi();
        Coke coldDrink=new Coke();
        Bottle bottle=new Bottle();
        coldDrink.packing();
        Assertions.assertTrue(coldDrink instanceof Item);

    }

}