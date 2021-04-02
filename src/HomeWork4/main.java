package HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {

        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();

            if (checkWin0(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin0(DOT_O)) {
                System.out.println("Победил компьютер!");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра закончена");
        sc.close();
    }


        public static void initMap () {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        public static void printMap () {
            for (int i = 0; i <= map.length; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < map.length; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < map.length; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        public static void humanTurn () {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y));
            map[y][x] = DOT_X;
        }

        public static boolean isCellValid ( int x, int y){
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
            return map[y][x] == DOT_EMPTY;
        }

        public static void aiTurn () {
            int x, y;
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }

//        public static boolean checkWin0 (char symb){
//            if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//            if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//            if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//            if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//            if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//            if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//            if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//            return map[2][0] == symb && map[1][1] == symb && map[0][2] == symb;
//
//        }




    public static boolean isMapFull() {
        for (char[] chars : map) {
            for (int j = 0; j < map.length; j++) {
                if (chars[j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
            return true;
            }
    public static boolean checkWin0(char symb) {
        int countV; // проверка по вертикали
        int countH; // проверка по горизонтали
        int countDiagonalA = 0; // проверка по диагонали \
        int countDiagonalB = 0; // проверка по диагонали /
        for (int i = 0; i <= map.length - 1; i++) {
            countH = 0;
            countV = 0;
            for (int j = 0; j <= map.length - 1; j++) {

                if (map[i][j] == symb) {
                    countH++;
                    if (countH == DOTS_TO_WIN) return true;
                }


                if (map[j][i] == symb) {
                    countV++;
                    if (countV == DOTS_TO_WIN) return true;
                }
            }


            if (map[i][i] == symb) {
                countDiagonalA++;
                if (countDiagonalA == DOTS_TO_WIN) return true;
            } else countDiagonalA = 0;


            if (map[i][map.length - 1 - i] == symb) {
                countDiagonalB++;
                if (countDiagonalB == DOTS_TO_WIN) return true;
            } else countDiagonalB = 0;
        }
        return false;
    }

}
