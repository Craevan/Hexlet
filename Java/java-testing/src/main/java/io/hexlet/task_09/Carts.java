package io.hexlet.task_09;

import io.hexlet.task_09.implementations.Cart;
import io.hexlet.task_09.implementations.CartRight;
import io.hexlet.task_09.implementations.CartWrong1;
import io.hexlet.task_09.implementations.CartWrong2;
import io.hexlet.task_09.implementations.CartWrong3;

public class Carts {
    private static String implementation = "right";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static Cart makeCart() {
        return switch (implementation) {
            case "wrong1" -> new CartWrong1();
            case "wrong2" -> new CartWrong2();
            case "wrong3" -> new CartWrong3();
            default -> new CartRight();
        };
    }
}