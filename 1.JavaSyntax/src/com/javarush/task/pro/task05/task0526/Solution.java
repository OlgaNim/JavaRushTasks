package com.javarush.task.pro.task05.task0526;

/* 
Атака вирусов
*/

// Ошибка: Exception in thread "main" java.lang.NullPointerException: Cannot load from object array because
// "com.javarush.task.pro.task05.task0526.Solution.array" is null
//	at com.javarush.task.pro.task05.task0526.Solution.main(Solution.java:14)
import java.util.Arrays;

public class Solution {
    public static int[][] array;

    public static void main(String[] args) {

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;
        array[1][0] = 5;
        array[1][1] = 6;
        array[1][2] = 7;
        array[1][3] = 8;
        array[2][0] = 9;
        array[2][1] = 10;
        array[2][2] = 11;
        array[2][3] = 12;

        //array = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}}

        printArray();

        //напишите тут ваш код

        printArray();
    }

    public static void printArray() {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
