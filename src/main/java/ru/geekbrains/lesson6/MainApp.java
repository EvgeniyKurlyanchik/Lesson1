package ru.geekbrains.lesson6;

public class MainApp {
    private static int catCount = 0;
    private static int dogCount = 0;

    public static void main(String[] args) {
        Cat cat1 = new Cat("Кот Барсик", 3);
        catCount++;
        Cat cat2 = new Cat("Кот Кузя", 5);
        catCount++;
        cat1.animalInfo();
        cat1.run(200);
        cat1.swim(1);
        cat2.animalInfo();
        cat2.run(250);
        System.out.println("Количество котов = " + catCount);


        Dog dog1 = new Dog("Собака Тузик", 2);
        dogCount++;
        Dog dog2 = new Dog("Собака Шарик", 7);
        dogCount++;
        dog1.animalInfo();
        dog1.run(400);
        dog1.swim(8);
        dog2.animalInfo();
        dog2.run(540);
        dog2.swim(12);
        System.out.println("Количество собак = " + dogCount);
    }
}
