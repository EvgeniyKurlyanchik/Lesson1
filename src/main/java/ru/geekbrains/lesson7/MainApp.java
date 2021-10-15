package ru.geekbrains.lesson7;

public class MainApp {
    private static int TIME = 0;

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Barsik", 20, 1);
        cat[1] = new Cat("Belyash", 25, 2);
        cat[2] = new Cat("Pushok", 30, 3);
        Plate plate = new Plate(100);
        plate.info();
        System.out.println("У нас три голодных кота" + "\n" + cat[0].getName() + "  " + cat[1].getName() + "  " + cat[2].getName());
        do {
            for (Cat i : cat) {

                if (i.getSatiety() == 0) {
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }

                    i.eat(plate);
                    System.out.println(i.getName() + " съел " + i.getAppetite() + " граммов корма и проголодается через " + (i.getSatiety()) + " часа");
                }

                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("\nПрошло " + TIME + " час(а). В миске осталось " + plate.getFood() + " граммов корма.\n");
            TIME++;

        } while (TIME <= 12);
    }
}