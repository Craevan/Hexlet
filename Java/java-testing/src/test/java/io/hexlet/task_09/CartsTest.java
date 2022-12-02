package io.hexlet.task_09;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static io.hexlet.task_09.Carts.makeCart;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class CartsTest {

    @Test
    void testCart() {
        var cart = makeCart();

        assertEquals(0, cart.getItems().size());

        var testGood1 = new Good("Test", 10);
        cart.addItem(testGood1, 1);
        assertEquals(1, cart.getItems().size());
        assertThat(cart.getItems().contains(Map.of("good", testGood1, "count", 1)));
        assertEquals(10, cart.getCost());
        assertEquals(1, cart.getCount());

        var testGood2 = new Good("house", 10);
        cart.addItem(testGood2, 2);
        assertEquals(30, cart.getCost());
        assertEquals(3, cart.getCount());
    }
}