package ru.geekbrains.lesson6;

public class MainApp {
    public static void main(String[] args) {
        Cat cat1 =new Cat("Кот Барсик", 3);
        Cat cat2 =new Cat("Кот Кузя", 5);

        cat1.animalInfo();
        cat1.run(200);
        cat1.swim(1);
        cat2.animalInfo();
        cat2.run(250);


        Dog dog1 = new Dog( "Собака Тузик", 2);
        Dog dog2 = new Dog( "Собака Шарик", 7);
        dog1.animalInfo();
        dog1.run(400);
        dog1.swim(8);
        dog2.animalInfo();
        dog2.run(540);
        dog2.swim(12);
    }
}
