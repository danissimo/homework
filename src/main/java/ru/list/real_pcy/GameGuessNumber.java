package ru.list.real_pcy;

import java.util.Random;
import java.util.Scanner;

/**
 * Java Doc Comments
 * Задание: написать программу, которая загадывает число от 0 до 100. Программа заправшивает у пользователя
 * число, которое он должен угадать. У пользователя 10 попыток. Как только игра заканчивается, ввыводится
 * зашгаданное число.
 * При каждой неверной попытке программа сообщает, загаданное число было больше или меньше, чем ввдённое.
 * (Этот класс запушить в реп)
 */

public class GameGuessNumber {
    public static void main(String[] args) {
        gameGuessNumber();
    }

    private static void gameGuessNumber() {
        Random r = new Random();
        int high = 100;
        int result = r.nextInt(high + 1);
        Scanner scan = new Scanner(System.in);
        int counter = 10;

//        for (int counter = 0; counter < 10; counter++) {
//            if (inputNumber == result) {
//                System.out.println("эйсссс");
//            } else if (inputNumber > result) {
//                System.out.println("Введённое число больше загаданного");
//            } else {
//                System.out.println("Введённое число меньше загаданного");
//            }

        while (counter != 0) {
            int inputNumber = scan.nextInt();
            if (inputNumber == result) {
                System.out.println("Мишшн комплит");
                counter = 0; //в нашем случае - эквивалент return, так как не исполняется условие
                //break  - эквивалент return
                //countinue - tioyhrtiuyh
            }
            if (inputNumber > result) {
                System.out.println("Введённое число больше загаданного");
                counter--;
            } else {
                System.out.println("Введённое число меньше загаданного");
                counter--;
            }
        }
        System.out.println("Загаданное число - " + result);
    }
}