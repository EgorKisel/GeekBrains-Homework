package HomeWork3;


import java.util.Random;
import java.util.Scanner;

public class main {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        guessNumber();
        repeatGame ();
    }

    public static void guessNumber() {
        int computerNumberFromTo = random.nextInt(10);
        System.out.println("Угадайте число от 0 до 9.");
        for (int i = 0; i < 3; i++) {
            System.out.println("Попытка " + (i + 1) + ": ");
            int numberFromTo = scanner.nextInt();
            if (numberFromTo > computerNumberFromTo)
                System.out.println("Загаданное число меньше. " +
                        "Попробуйте еще раз.");
            if (numberFromTo < computerNumberFromTo)
                System.out.println("Загаданное число больше. Попробуйте еще раз.");
            if (numberFromTo == computerNumberFromTo){
                System.out.println("Поздравляем, вы угадали!");
                break;
            }

        }
    }

    public static void repeatGame() {
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int numberFromTo = scanner.nextInt();
        if (numberFromTo == 1) guessNumber();
        else
            System.out.println("Спасибо за игру!");
        }


}