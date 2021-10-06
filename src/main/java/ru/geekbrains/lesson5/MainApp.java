package ru.geekbrains.lesson5;

public class MainApp {
    public static void main(String[] args) {
        Worker[] personArr = new Worker[5];
        personArr[0] = new Worker("Ivanov_Ivan", "manager", "ivanov@mail.ru", "+79051234578",
                50000, 32);
        personArr[1] = new Worker("Sidorov_Ivan", "manager", "sidorov@mail.ru", "+79262312456",
                50000, 25);
        personArr[2] = new Worker("Semenov_Semen", "engineer", "semenov@mail.ru", "+79151234578",
                50000, 43);
        personArr[3] = new Worker("Vasyakin_Vasya", "manager", "vasya@mail.ru", "+79991234578",
                50000, 39);
        personArr[4] = new Worker("Petrov_Petr", "manager", "petrov@mail.ru", "+79051234578",
                50000, 52);

        // for (Worker e : personArr) if (e.getAge() > 40) e.getFullInfo();*/
        for (int i = 0; i < personArr.length; i++) {
            if (personArr[i].getAge() > 40) {
                personArr[i].getFullInfo();
            }

        }

    }

}


