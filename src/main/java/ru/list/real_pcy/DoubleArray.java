package ru.list.real_pcy;

import java.lang.reflect.Array;

public class DoubleArray {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int[][] array = new int[x][y];

        array[0][0] = 5;
        array[0][1] = 55;

        System.out.println(array[0][1] + array[0][0]);
        System.out.println(array[1][0] + array[0][0]);

//        int q = 0;
//        for (int x = 0; x < Array.length; x++) {
//            System.out.println(Array[x][0] = q++);
//        }
//        for (int y = 0; y < Array.length; y++) {
//            System.out.println(Array[0][y] = q++);
//        }
    }
}
