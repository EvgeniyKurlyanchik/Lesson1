package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public int getFood() {
        return food;
    }


    public void info() {
        System.out.println("Food amount: " + food);
    }

    protected void increaseFood() {
        this.food += 100;
        System.out.println("В миску добавили 100 грамм корма");
    }

    public boolean checkFood(int n) {
        return (food - n) >= 0;
    }


}
