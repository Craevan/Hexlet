package io.hexlet.task_09;

public class Good {
    private String name;
    private int price;

    Good(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
