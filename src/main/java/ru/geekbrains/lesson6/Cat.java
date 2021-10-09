package ru.geekbrains.lesson6;



  class Cat extends Animal {
private final int MAX_RUN_LENGTH =200;

    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
    }

      @Override
      void run(int length) {
          if( length>=0 && length<=MAX_RUN_LENGTH ){
              System.out.println("дистанция бега доступна");
          }else
              System.out.println("бег невозможен");
      }

      @Override
      void swim(int length) {
          System.out.println("кошка не плавает");
    }
      /*  @Override
    public void animalInfo() {
        super.animalInfo();
    }*/

}
