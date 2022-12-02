package io.hexlet.task_10;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static io.hexlet.task_10.Methods.indexOf;

import java.util.List;

public class MethodsTest {
    @Test
    public void testIndexOf() {
        var coll = List.of(1, 2, 3, 2, 5);
        var actual = indexOf(coll, 2, 2);
        assertThat(actual).isEqualTo(3);

        actual = indexOf(coll, 2);
        assertThat(actual).isEqualTo(1);

        actual = indexOf(coll, 2, -3);
        assertThat(actual).isEqualTo(3);

        actual = indexOf(coll, 7);
        assertThat(actual).isEqualTo(-1);

        actual = indexOf(coll, 1, -6);
        assertThat(actual).isEqualTo(0);

        var emptyColl = List.of();
        actual = indexOf(emptyColl, 1);
        assertThat(actual).isEqualTo(-1);
    }
}
