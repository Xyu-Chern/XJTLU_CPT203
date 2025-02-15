package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class assertSame {
    @Test
    public void assertSameShowcase() {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        Assertions.assertSame(s1, s2);
    }
}