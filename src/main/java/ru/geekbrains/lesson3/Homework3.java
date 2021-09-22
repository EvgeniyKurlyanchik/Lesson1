package ru.geekbrains.lesson3;

import java.util.Arrays;

/*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
public class Homework3 {

    public static void main(String[] args) {
        System.out.println("Задание 1: ");
        inverterArray();
        System.out.println("\n Задание 2: ");
        numbArr();
        System.out.println("\n Задание 3: ");
        checkArrMult();
        System.out.println("\n Задание 4: ");
        fillDiagArr();
        System.out.println("\n Задание 5: ");
        arrValNum(8, 3);
        System.out.println("\n Задание 6: ");
        System.out.println(Arrays.toString(arr5));
        minMaxArr();
        System.out.println("\n Задание 7: ");
        System.out.println(checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println(checkBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println("\n Задание 8: ");
        modifyArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, -1);
    }

    public static void inverterArray() {
        int[] arr = {1, 1, 0, 0, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.print((arr[i] = 0) + " ,");

            } else {
                System.out.print((arr[i] = 1) + " ,");
            }

        }

    }

    public static void numbArr() {
        int[] arr2 = new int[100];
        for (int i = 0; i < (arr2.length); i++) {
            arr2[i] += i + 1;

        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void checkArrMult() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr3));

    }

    /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы
        одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/
    public static void fillDiagArr() {
        int[][] arr4 = new int[4][4];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                } else if (i == arr4.length - 1 - j) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void arrValNum(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
    /*6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;*/

    private static int[] arr5 = {5, 6, 3, 8, 3, 9, 3, 45, 1, 9};

    public static void minMaxArr() {
        int min = arr5[0];
        int max = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
            }
            if (arr5[i] < min) {
                min = arr5[i];
            }
        }
        System.out.println("\nminimal element is: " + min + "\nmaximal element is: " + max);
    }
 /* 7/Написать метод, в который передается не пустой одномерный целочисленный
        массив, метод должен вернуть true, если в массиве есть место,
    в котором сумма левой и правой части массива равны.*/

    public static boolean checkBalance(int[] arr) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum = 0;
            rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;

    }

    static void modifyArray(int[] arr, int n) {
        System.out.print("до сдвига: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("(n = " + n + ")");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                // Right
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                // Left
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }

        System.out.print("\nПосле сдвига   ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}



