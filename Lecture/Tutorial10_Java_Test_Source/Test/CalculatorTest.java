package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test  // Marks the method as a test method.
    public void CalculatorTest() {
        // Setup part - Creating an instance of the class under test,
        // plus the input and expected output
        Calculator calculator = new Calculator();
        int input1 =5;
        int input2 = 3;
        int Expected = 8;

        // Call Part
        // Calling the method to be tested with some inputs.
        int ActualResult = calculator.add(input1, input2);

        // Assertion Part
        // Asserting that the method returned the expected value.
        assertEquals(Expected, ActualResult,"Message we want to show");
    }
}