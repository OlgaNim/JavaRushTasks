package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -2147483648;
        int number;
        while (sc.hasNextInt()) {
            number = sc.nextInt();
            if ((number % 2 == 0) && (number >= max)) {
                max = number;
            }
        }
        System.out.println(max);
    }
}