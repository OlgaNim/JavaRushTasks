package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
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
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        System.out.println(max);

        //промежуточная проверка
        //String arrString = Arrays.toString(array);
        //System.out.println(arrString);
    }
}
