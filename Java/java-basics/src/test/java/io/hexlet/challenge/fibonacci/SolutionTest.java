package io.hexlet.challenge.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void fibTest() {
        assertEquals(Solution.fib(0), 0);
        assertEquals(Solution.fib(1), 1);
        assertEquals(Solution.fib(2), 1);
        assertEquals(Solution.fib(3), 2);
        assertEquals(Solution.fib(4), 3);
        assertEquals(Solution.fib(5), 5);
        assertEquals(Solution.fib(40), 102334155);
        assertEquals(Solution.fib(45), 1134903170);
        assertEquals(Solution.fib(46), 1836311903);
    }

}