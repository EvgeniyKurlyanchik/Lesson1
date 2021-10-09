package ru.geekbrains.lesson6;
/*1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        4. * Добавить подсчет созданных котов, собак и животных.*/
 abstract   class Animal {
protected String name;
  protected   int age;
  private final int MAX_RUN_LENGTH = 0;
  private final int MAX_SWIM_LENGTH = 0;

  abstract void run(int length);
    abstract void swim(int length);
    public void animalInfo(){
    System.out.println("Animal:  " + name + "\nage :" +  age );
}




}
