package io.hexlet.challenge.dnarna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void dnaToRnaTest() {
        String expected = "GGCAU";
        String actual = Solution.dnaToRna("CCGTA");
        assertEquals(expected, actual);
    }

    @Test
    void dnaToRnaTestEmptySting() {
        String expected = "";
        String actual = Solution.dnaToRna("");
        assertEquals(expected, actual);
    }

    @Test
    void dnaToRnaTestNull() {
        String actual = Solution.dnaToRna(null);
        assertNull(actual);
    }

    @Test
    void dnaToRnaTestWrongDna() {
        String actual = Solution.dnaToRna("ACNTG");
        assertNull(actual);
    }
}