package org.example;


    public class AssertThrowsCalCase {
        public double divide(int numerator, int denominator) {
            if (denominator == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return (double) numerator / denominator;
        }

    }