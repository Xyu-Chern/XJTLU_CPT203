package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertThrowsCalCaseTest {
    @Test
    public void testDivisionByZeroThrowsException() {
        // Create an instance of the AssertThrowsCalCase class.
        // This class contains the 'divide' method we want to test.
        AssertThrowsCalCase calculator = new AssertThrowsCalCase();

        // Use assertThrows to test that an ArithmeticException is thrown.
        // assertThrows takes two main parameters:
        // 1. The class of the exception we expect to be thrown.
        // 2. A lambda expression that executes the code we're testing.
        assertThrows(
                //The expected exception type.
                //Here, we expect an ArithmeticException.
                ArithmeticException.class,
                // This is the lambda expression.
                // It is used to execute the 'divide' method of the calculator object.
                // The 'divide' method is called with arguments 10 and 0.
                ()   ->   calculator.divide(10, 0));

    }
}