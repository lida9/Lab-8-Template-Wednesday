package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestPlusOne {

    @Test
    void testPlusOne() {
        MainActivity main = new MainActivity();
        assertTrue(2==main.plusOne(1));
    }

}
