package com.javarush.task.pro.task06.task0605;

/* 
Правильный порядок
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] temp = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            temp[array.length-i-1] = array[i];
            System.out.print(temp[array.length-i-1] + ", ");
            //System.out.print(array.length-i-1 + ", ");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }
        System.out.println();

    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
