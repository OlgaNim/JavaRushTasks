package com.javarush.task.pro.task05.task0504;

/* 
Объединяем массивы
*/

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        int n = firstArray.length;
        int k = secondArray.length;
        resultArray = new int[n + k];
        for (int a = 0; a < firstArray.length; a++) {
            resultArray[a] = firstArray[a];
        }
        for (int b = 0; b < secondArray.length; b++) {
            resultArray[firstArray.length + b] = secondArray[b];
        }


        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
