package com.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        multiArray = new int[num1][];
        for (int i = 0; i < num1; i++) {
            int k = sc.nextInt();
            multiArray[i] = new int[k];
        }
        //String arrString = Arrays.toString(multiArray);
        //System.out.println(arrString);
    }
}

