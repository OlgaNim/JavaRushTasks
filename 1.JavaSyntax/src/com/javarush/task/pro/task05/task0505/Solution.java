package com.javarush.task.pro.task05.task0505;

import java.util.Arrays;
import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        } while (n < 0);
        //System.out.println(n);

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if (n % 2 != 0) {
                //System.out.println(array[i]);
            } else {
                for (int j = array.length - 1; j >= 0; j--) {
                    //System.out.println(array[j]);
                }
            }
        }
        //промежуточная проверка
        //String arrString = Arrays.toString(array);
        //System.out.println(arrString);

        if (n % 2 != 0) {
            for (int m = 0; m < array.length; m++) {
                System.out.println(array[m]);
            }
        } else {
            for (int k = array.length - 1; k >= 0; k--) {
                System.out.println(array[k]);
            }
        }


    }
}




