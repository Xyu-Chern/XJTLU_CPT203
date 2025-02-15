package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


    public class JunitLifeCycle {

        // Class level setup - runs once before all tests
        @BeforeAll
        static void setupClass() {
            // Code to set up database connections or other heavy resources
        }

        // Method level setup - runs before each test
        @BeforeEach
        void setupTest() {
            // Code to initialize or reset test objects
        }

        // Actual test case
        @Test
        void testExample() {
            // Test execution and assertions
            assertEquals(2, 1 + 1);
        }

        // Method level cleanup - runs after each test
        @AfterEach
        void tearDownTest() {
            // Code to reset or clean up after each test
        }

        // Class level cleanup - runs once after all tests
        @AfterAll
        static void tearDownClass() {
            // Code to clean up database connections or other heavy resources
        }
}
