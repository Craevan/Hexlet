package io.hexlet.task_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.Assertions.assertThat;
import static io.hexlet.task_11.implementations.Methods.fill;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodsTest {
    private List<String> testList;

    @BeforeEach
    void init() {
        testList = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
    }

    @Test
    void fillTest1() {
        var expected = List.of("a", "*", "*", "d");
        var actual = fill(testList, "*", 1, 3);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fillTest2() {
        var expected = List.of("*", "*", "*", "*");
        var actual = fill(testList, "*");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fillTest3() {
        var expected = List.of("a", "b", "c", "d");
        var actual = fill(testList, "*", 4, 6);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fillTest4() {
        var expected = List.of("*", "*", "*", "*");
        var actual = fill(testList, "*", 0, 10);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fillTest5() {
        var expected = List.of("a", "b", "*", "*");
        var actual = fill(testList, "*", 2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fillTest6() {
        var expected = List.of("a", "b", "c", "d");
        var actual = fill(testList, "*", 2, -1);
        assertThat(actual).isEqualTo(expected);
    }
}
