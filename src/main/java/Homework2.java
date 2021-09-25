
/*
1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
        (включительно), если да – вернуть true, в противном случае – false.
        2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
        если число отрицательное, и вернуть false если положительное.
        4. Написать метод, которому в качестве аргументов передается строка и число,
        метод должен отпечатать в консоль указанную строку, указанное количество раз;
        5. * Написать метод, который определяет, является ли год високосным, и возвращает
        boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
        кроме каждого 100-го, при этом каждый 400-й – високосный.
*/
public class Homework2 {
    public static void main(String[] args) {
        int a = 10;
        int b = -5;
        int y =2020;
     System.out.println (checkSumm (a, b));
     checkNumber(a);
     System.out.println( checkNumber1(b));
     int c = 10;
     String d = "Строка ";
     printStrNumbers(d, c);
     System.out.println(checkYear(y));
    }


    public static boolean checkSumm (int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void checkNumber (int a){
       if( a >= 0 ) {
           System.out.println(" Число положительное\n" + a);
       }else{
           System.out.println(" Число отрицательное"+ a);
       }

    }
    public static boolean checkNumber1( int b){
        if ( b < 0){

        return true;
    } else {
            return false;

        }
    }
// 4. Написать метод, которому в качестве аргументов передается строка и число,
//        метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void printStrNumbers(String d, int c) {
        for (int i = 0; i < c; i++) {
            System.out.println( d + (i+1));
        }

    }
/*           5. * Написать метод, который определяет, является ли год високосным, и возвращает
    boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
    кроме каждого 100-го, при этом каждый 400-й – високосный.*/
public static boolean checkYear(int y) {

    if((y % 4==0 && y % 100 != 0 ) || y % 400 == 0){
        System.out.println("Високосный год " +y);
        return true;
    } else {
        System.out.println("Не високосный год " +y);
        return false;
    }
}




}