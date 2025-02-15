package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {
@Test
    public void testArray() {
    int[] expectedArray = new int[] {3, 2, 1};
    int[] actualArray = Array.generateArray();
    assertArrayEquals(expectedArray, actualArray);}
}