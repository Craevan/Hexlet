package io.hexlet.task_11.implementations;

import java.util.List;

class FillWrong3 {

    public static <T> List<T> fill(List<T> coll, T element, int begin, int end) {
        if (begin >= end) {
            coll.add(element);
            return coll;
        }

        var collLength = coll.size();
        var normalizedBegin = begin > collLength ? end : begin;
        var normalizedEnd = end > collLength ? collLength : end;

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
