package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void test() {
        Assertions.assertEquals("Hello23", new Util().test());
    }
}
