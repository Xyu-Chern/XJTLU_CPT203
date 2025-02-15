package org.example;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class testAnnotations {

    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }


    @DisplayName("I need a name")
    @RepeatedTest(3)
    @Test
    void test1()
    {
        System.out.println("======TEST ONE EXECUTED=======");
        assertEquals( 4 , Calculator.add(2, 2));
    }

    @Test
    void test2()
    {
        System.out.println("======TEST TWO EXECUTED=======");
        assertEquals( 7 , Calculator.add(2, 4));
    }

    @Test
    void test3()
    {
        System.out.println("======TEST Three EXECUTED=======");
        assertEquals( 7 , Calculator.add(2, 4));
    }

    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }

    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}