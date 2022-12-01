package io.hexlet.challenge.fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final List<Integer> CACHE = new ArrayList<>();

    static {
        CACHE.add(0);
        CACHE.add(1);
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isCorrect = false;
        int number = -1;
        System.out.println("Введите порядковый номер:");
        while (!isCorrect) {
            try {
                number = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException | IOException e) {
                System.out.println("Необходимо ввести число");
            }
            if (number >= 0) {
                isCorrect = true;
            } else {
                System.out.println("Число должно быть больше или равно нулю!");
                System.out.println("Введите порядковый номер:");
            }
        }
        System.out.println(number + " : " + fib(number));
    }

    private static int fib(int number) {
        for (int i = CACHE.size(); i <= number; i++) {
            int result = CACHE.get(i - 1) + CACHE.get(i - 2);
            CACHE.add(result);
        }
        return CACHE.get(number);
    }
}
