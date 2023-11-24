package com.javarush.task.pro.task05.task0526;

/* 
Атака вирусов
*/

import java.util.Arrays;

public class Solution {
    public static int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

    public static void main(String[] args) {
        printArray();

        int[][] tempArray = new int[3][4];
        tempArray[0][0] = array[2][0];
        tempArray[0][1] = array[2][1];
        tempArray[0][2] = array[2][2];
        tempArray[0][3] = array[2][3];

        array[2][0] = array[0][0];
        array[2][1] = array[0][1];
        array[2][2] = array[0][2];
        array[2][3] = array[0][3];

        array[0][0] = tempArray[0][0];
        array[0][1] = tempArray[0][1];
        array[0][2] = tempArray[0][2];
        array[0][3] = tempArray[0][3];

        printArray();
    }

    public static void printArray() {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
