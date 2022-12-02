package io.hexlet.task_09;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodTest {

    Good testGood;

    @BeforeEach
    void init() {
        testGood = new Good("TEST", 10);
    }

    @Test
    void getPriceTest() {
        var expected = 10;
        var actual = testGood.getPrice();
        assertEquals(expected, actual);
    }
}