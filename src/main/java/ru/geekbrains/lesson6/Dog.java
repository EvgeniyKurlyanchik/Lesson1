package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.Animal;


class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;

    protected Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected void run(int length) {
        if (length >= 0 && length <= MAX_RUN_LENGTH) {
            System.out.println("пробежит дистанцию");
        } else System.out.println("бег недоступен ");
    }

    @Override
    protected void swim(int length) {
        if (length >= 0 && length <= MAX_SWIM_LENGTH) {
            System.out.println("проплывет");
        } else System.out.println("недоплывет");

    }



}
