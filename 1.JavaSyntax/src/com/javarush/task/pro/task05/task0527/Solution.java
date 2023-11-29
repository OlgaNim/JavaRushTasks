package com.javarush.task.pro.task05.task0527;

/* 
Подготовка Кибердракона
*/

public class Solution {
    public static int[][] array = new int[5][];

    public static void main(String[] args) {
        for (int k = 0; k < array.length; k++) {
            for (int m = 0; m < 2 * k + 1; m++) {
                array[k] = new int[]{m + k};
            }

        }
        //array[k] = new int[] {m + k};
    }

    {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//for (int k = 0; k < array.length; k++) {
//        for (int m = 0; m < 2 * k + 1; m++) {
//        for (int p = 0; p < k + m + 1; p++) {
//        array[k][m] = p + k;
