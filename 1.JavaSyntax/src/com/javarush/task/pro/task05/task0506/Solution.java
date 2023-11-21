package com.javarush.task.pro.task05.task0506;

import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println(min);

        //промежуточная проверка
        //String arrString = Arrays.toString(array);
        //System.out.println(arrString);
    }
}
