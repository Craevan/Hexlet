package io.hexlet.task_08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.hexlet.task_08.Methods.add;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsTest {
    private List<Integer> array;

    @BeforeEach
    public void init() {
        array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    }

    @Test
    public void testAdd() {
        var expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertThat(array).isEqualTo(expected);
    }

    @Test
    public void testAdd1() {
        var expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        var added = add(array, 5);
        assertThat(added).isTrue();
        assertThat(array).isEqualTo(expected);
    }

    @Test
    public void testAdd2() {
        var expected = new ArrayList<>(Arrays.asList(1, 2, 5, 3, 4));
        var added = add(array, 5, 2);
        assertThat(added).isTrue();
        assertThat(array).isEqualTo(expected);
    }

    @Test
    public void testAdd3() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        var added = add(array, 5, 4);
        assertThat(added).isTrue();
        assertThat(array.toArray()).containsExactly(expected.toArray());
    }

    @Test
    public void testAdd4() {
        var added = add(array, 10, 4);
        var expected = List.of(1, 2, 3, 4, 10);
        assertThat(added).isTrue();
        assertThat(array).isEqualTo(expected);
    }
}
