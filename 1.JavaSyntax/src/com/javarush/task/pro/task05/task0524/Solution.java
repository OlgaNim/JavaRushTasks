package com.javarush.task.pro.task05.task0524;

/* 
Взлом Кибердракона
*/

import java.util.Arrays;

public class Solution {
    public static int[] coordinates;

    public static void main(String[] args) {
        coordinates = new int[200];
        for (int i = 0; i < coordinates.length / 2; i++) {
            coordinates[i*2] = i * 10;
            coordinates[i*2+1] = i * 10 + 1;


        }
        System.out.println(Arrays.toString(coordinates));
    }
}



//for (int i = 0; i < coordinates.length; i++) {
//        if (i % 2 == 0) {
//        coordinates[i] = i;
//        System.out.print(coordinates[i] + ", ");
//
//        } else {
//        coordinates[i] = i;
//        System.out.print(coordinates[i] + ", ");
//coordinates[i] = i + 9;
//        }

//for (int i = 0; i < coordinates.length; i++) {
//        for (int j = 0; j < 2; j++) {
//        if (j % 2 == 0) {
//        coordinates[j] = i * 10;
//        System.out.print(coordinates[j] + ", ");
//        } else {
//        coordinates[j] = i * 10 + 1;
//        System.out.print(coordinates[j] + ", ");
//        }
//        }
//        }
//for (int i = 0; i < coordinates.length / 2; i++) {
//        for (int j = 0; j < 2; j++) {
//        if (j % 2 == 0) {
//        coordinates[j] = i * 10;
//        System.out.print(coordinates[j] + ", ");
//        } else {
//        coordinates[j] = i * 10 + 1;
//        if (coordinates[j] < 991) {
//        System.out.print(coordinates[j] + ", ");
//        } else {
//        System.out.println(coordinates[j] + ".");