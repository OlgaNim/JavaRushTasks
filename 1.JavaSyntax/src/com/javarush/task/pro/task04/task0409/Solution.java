package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minimum = 2147483647;
        int number;
        while (sc.hasNextInt()) {
            number = sc.nextInt();
            if (number <= minimum) {
                minimum = number;
            }
        }
        System.out.println(minimum);
    }
}