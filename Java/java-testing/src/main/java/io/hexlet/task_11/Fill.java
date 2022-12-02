package io.hexlet.task_11;

import java.util.List;

public class Fill {

    public static <T> List<T> fill(List<T> coll, T element, int begin, int end) {
        int normalizedBegin = begin > coll.size() ? end : begin;
        int normalizedEnd = Math.min(end, coll.size());

        for (var i = normalizedBegin; i < normalizedEnd; i++) {
            coll.set(i, element);
        }

        return coll;
    }

    public static <T> List<T> fill(List<T> coll, T element, int begin) {
        return fill(coll, element, begin, coll.size());
    }

    public static <T> List<T> fill(List<T> coll, T element) {
        return fill(coll, element, 0, coll.size());
    }
}
