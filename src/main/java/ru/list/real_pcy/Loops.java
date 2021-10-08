package ru.list.real_pcy;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.*;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;

public class Loops {
    // Loops 1
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(bufferedReader.readLine().trim());
//        for (int i = 0; i <= 10; i++) {
//            int result = N * i;
//            System.out.println(N + " x " + i + " = " + result);
//        }
//        bufferedReader.close();

        // Loops 2
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        for (int i = 0; i < t; i++) {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            int c = a;
//            for (int j = 0; j < n; j++) {
//                c += Math.pow(2, j) * b;
//                System.out.printf("%s ", c);
//            }
//            System.out.println();
//        }
//        in.close();

        // Исключения (Exceptions lessons)
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        if (inputString.matches("[0-9]+")){
            int parsedNumber = Integer.parseInt(inputString);
        } else {
            System.out.println("Вы ввели не целое число");
        }
//        try {
//            //опасный код
//        }
//        catch (Exception e) //тип исключения
//        {
//            //блок обработки исключения
//        }
//        finally //финальный блок
//        {
//            //обработка
//        }
        String userInout = inputString();
        try {
            int parsedNumber
//            int parsedNumber = Integer.parseInt(inputString);
            System.out.println(parsedNumber);
        }
        catch (Exception e) {
            System.out.println("Вы получили следующую ошибку" + e.toString());
        }
    }
    private static String inputString(){
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return inputString;
    }

    private static int parseNumber(String inputString){

        String str = inputString();
        int parsedNumber = Integer.parseInt(java.lang.String.valueOf(inputString));
        return parsedNumber;
    }
}