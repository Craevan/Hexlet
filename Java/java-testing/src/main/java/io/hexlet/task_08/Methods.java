package io.hexlet.task_08;

import java.util.List;

import io.hexlet.task_08.implementations.AddRight;
import io.hexlet.task_08.implementations.AddWrong1;
import io.hexlet.task_08.implementations.AddWrong2;
import io.hexlet.task_08.implementations.AddWrong3;
import io.hexlet.task_08.implementations.AddWrong4;


public class Methods {
    private static String implementation = "right";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static <T> boolean add(List<T> coll, T element) {
        return switch (implementation) {
            case "wrong1" -> AddWrong1.add(coll, element);
            case "wrong2" -> AddWrong2.add(coll, element);
            case "wrong3" -> AddWrong3.add(coll, element);
            case "wrong4" -> AddWrong4.add(coll, element);
            default -> AddRight.add(coll, element);
        };
    }

    public static <T> boolean add(List<T> coll, T element, int index) {
        return switch (implementation) {
            case "wrong1" -> AddWrong1.add(coll, element, index);
            case "wrong2" -> AddWrong2.add(coll, element, index);
            case "wrong3" -> AddWrong3.add(coll, element, index);
            case "wrong4" -> AddWrong4.add(coll, element, index);
            default -> AddRight.add(coll, element, index);
        };
    }
}
