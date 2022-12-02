package io.hexlet.task_11.implementations;

import java.util.List;

import io.hexlet.task_11.Fill;

public class Methods {
    private static String implementation = "usersImplementation";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }


    public static <T> List<T> fill(List<T> coll, T element, int begin, int end) {
        return switch (implementation) {
            case "right" -> FillRight.fill(coll, element, begin, end);
            case "wrong1" -> FillWrong1.fill(coll, element, begin, end);
            case "wrong2" -> FillWrong2.fill(coll, element, begin, end);
            case "wrong3" -> FillWrong3.fill(coll, element, begin, end);
            default -> Fill.fill(coll, element, begin, end);
        };
    }

    public static <T> List<T> fill(List<T> coll, T element, int begin) {
        return switch (implementation) {
            case "right" -> FillRight.fill(coll, element, begin);
            case "wrong1" -> FillWrong1.fill(coll, element, begin);
            case "wrong2" -> FillWrong2.fill(coll, element, begin);
            case "wrong3" -> FillWrong3.fill(coll, element, begin);
            default -> Fill.fill(coll, element, begin);
        };
    }

    public static <T> List<T> fill(List<T> coll, T element) {
        return switch (implementation) {
            case "right" -> FillRight.fill(coll, element);
            case "wrong1" -> FillWrong1.fill(coll, element);
            case "wrong2" -> FillWrong2.fill(coll, element);
            case "wrong3" -> FillWrong3.fill(coll, element);
            default -> Fill.fill(coll, element);
        };
    }
}
