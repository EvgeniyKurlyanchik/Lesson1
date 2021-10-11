package ru.geekbrains.lesson6;


abstract class Animal {
    protected String name;
    protected int age;
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;

    abstract void run(int length);

    abstract void swim(int length);

    public void animalInfo() {
        System.out.println("Animal:  " + name + ", age :" + age);
    }


}
