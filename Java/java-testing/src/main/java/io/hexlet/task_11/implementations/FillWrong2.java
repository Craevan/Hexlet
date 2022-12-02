package io.hexlet.task_11.implementations;

import java.util.List;

class FillWrong2 {

    public static <T> List<T> fill(List<T> coll, T element, int begin, int end) {

        var collLength = coll.size();

        if (begin >= collLength) {
            coll.add(element);
            return coll;
        }

        var normalizedEnd = end > collLength ? collLength : end;

        for (var i = begin; i < normalizedEnd; i++) {
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
