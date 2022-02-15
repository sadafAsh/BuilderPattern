package com.soj.pattern.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BottleTest {

    @Test
    void testToPackTheBottle() {
        Packing packing=new Bottle();
        String expected="Bottle";
        Assertions.assertEquals(expected,packing.pack());
    }
}