package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static int size;
    public static int aiLevel;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Введите размерность поля (цифра от 1 до 5)");
        size = sc.nextInt();
        System.out.println("Введите режим глупого компа цифра  0 или умного 2  ");
        aiLevel = sc.nextInt();
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (check(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (check(DOT_O)) {
                System.out.println("Победил Компутер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        if (map[y][x] == DOT_EMPTY) {
            return true;
        } else return false;
    }

    public static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean check(char symb) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (size - 1 - i == j && map[i][j] == symb) {
                    counter++;
                }
            }

        }
        if (counter == size) {
            return true;
        } else {
            counter = 0;
        }


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j && map[i][j] == symb) {
                    counter++;
                }
            }
        }
        if (counter == size) {
            return true;
        } else {
            counter = 0;
        }

        for (int i = 0; i < size; i++) {  //lines
            for (int j = 0; j < size; j++) {
                if (map[i][j] == symb) {
                    counter++;

                }
            }
            if (counter == size) {
                return true;
                //break;
            } else {
                counter = 0;
            }
        }
        counter = 0;
        for (int i = 0; i < size; i++) {  //columns
            for (int j = 0; j < size; j++) {
                if (map[j][i] == symb) {
                    counter++;
                }
            }
            if (counter == size) {
                return true;
                //break;
            } else {
                counter = 0;
            }
        }
        return false;
    }


    public static void aiTurn() {
        int x = -1;
        int y = -1;
        int maxScoreMapX = -1;
        int maxScoreMapY = -1;
        int maxScore = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int mapScore = 0;

                if (map[i][j] == DOT_EMPTY) {
                    //влево вверх
                    if (i - 1 >= 0 && j - 1 >= 0 && map[i - 1][j - 1] == DOT_O) {
                        mapScore++;
                        System.out.println("LU");

                    }
                    //верх
                    if (i - 1 >= 0 && map[i - 1][j] == DOT_O) {
                        mapScore++;
                        System.out.println("U");

                    }
                    //право верх
                    if (i - 1 >= 0 && j + 1 < size && map[i - 1][j + 1] == DOT_O) {
                        mapScore++;
                        System.out.println("RU");
                    }
                    //право
                    if (j + 1 < size && map[i][j + 1] == DOT_O) {
                        mapScore++;
                        System.out.println("R");

                    }
                    //право низ
                    if (i + 1 < size && j + 1 < size && map[i + 1][j + 1] == DOT_O) {
                        mapScore++;
                        System.out.println("RD");

                    }
                    //down
                    if (i + 1 < size && map[i + 1][j] == DOT_O) {
                        mapScore++;
                        System.out.println("D");

                    }
                    //лево низ
                    if (i + 1 < size && j - 1 >= 0 && map[i + 1][j - 1] == DOT_O) {
                        mapScore++;
                        System.out.println("LD");

                    }
                    //лево
                    if (j - 1 >= 0 && map[i][j - 1] == DOT_O) {
                        mapScore++;
                        System.out.println("L");
                    }
                }
                if (mapScore > maxScore) {
                    maxScore = mapScore;
                    maxScoreMapX = j;
                    maxScoreMapY = i;

                }
            }

        } // ? maxScore
        if (maxScoreMapX != -1 || maxScoreMapY != -1) {
            x = maxScoreMapX;
            y = maxScoreMapY;

        }
        if (x == -1) {
            do {
                x = rand.nextInt(size);
                y = rand.nextInt(size);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер Random " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

}
