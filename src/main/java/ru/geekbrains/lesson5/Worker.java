package ru.geekbrains.lesson5;

public class Worker {
    private String nameFamily;
    private String profession;
    private String eMail;
    private String phoneNumber;
    private int salary;
    private int age;


    public Worker(String nameFamily, String profession, String eMail, String phoneNumber, int salary, int age) {
        this.nameFamily = nameFamily;
        this.profession = profession;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void getFullInfo() {
        System.out.println("Фамилия_Имя " + nameFamily + "|должность  " + profession + "|эл.почта " + eMail
                + "|номер телефона " + phoneNumber + "|зарплата " + salary + "| возраст " + age);

    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        }
    }

}
