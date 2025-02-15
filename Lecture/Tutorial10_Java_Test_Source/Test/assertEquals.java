package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class assertEquals {

@Test
public void testCombining() {
    StringCase SC = new StringCase();

    String expected = "HelloWorld";
    String actual = SC.combining("Hello", "World");

    assertEquals(expected, actual);
  }
}