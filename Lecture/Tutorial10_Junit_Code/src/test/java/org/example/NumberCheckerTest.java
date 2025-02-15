package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    @Test
    public void testIsPositive() {
        NumberChecker checker = new NumberChecker();
        boolean isPositive = checker.isPositive(5);
        assertTrue(isPositive);
        assertFalse(isPositive, "This failure message is optional");
    }
}