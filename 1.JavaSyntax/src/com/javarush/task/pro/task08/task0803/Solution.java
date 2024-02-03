package com.javarush.task.pro.task08.task0803;

import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] ints = getArrayOfTenElements();
        System.out.println(min(ints));

    }

    public static int min(int[] ints) {
        int min = ints[0];
        for (int i = 0; i < ints.length; i++){
            min = Math.min(min, ints[i]);
        }

        return min;
    }

    public static int[] getArrayOfTenElements() {
        /*int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

            //System.out.println(array[i]);
        }
        //System.out.println(Arrays.toString(array));
        return array; */
        int[] ints = new int[10];
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while ( number <= 10) {
            ints[number] = sc.nextInt();
            number += 1;
            if (number == 10) {
                break;
            }
        }
        System.out.println(Arrays.toString(ints));
        return ints;
    }
}


/*nt [] array = getArrayOfTenElements();
    int intArray = Math.min(Math.min(Math.min(array[1], array[2]),Math.min(array[3], array[4])),
            Math.min(Math.min(array[5], array[6]), Math.min(Math.min(array[7], array[8]), Math.min(array[9], array[10]))));
        System.out.println(intArray);
                return intArray;*/