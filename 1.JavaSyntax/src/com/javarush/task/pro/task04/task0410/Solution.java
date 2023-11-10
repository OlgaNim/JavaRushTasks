package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min1 = 2147483646;
        int min2 = 2147483647;
        int number;
        while (sc.hasNextInt()) {
            number = sc.nextInt();
                if (number <= min1) {
                    min2 = min1;
                    min1 = number;
                }
            }
        System.out.println(min2);
        }
    }

