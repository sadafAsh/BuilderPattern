package com.soj.pattern.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapperTest {

    @Test
    void testToPackTheWrapper() {
        Packing packing=new Wrapper();
        String expected="Wrapper";
        Assertions.assertEquals(expected,packing.pack());
    }
}