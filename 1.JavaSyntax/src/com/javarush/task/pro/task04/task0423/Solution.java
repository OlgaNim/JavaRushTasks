package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;

/* 
Калибровка климата
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        for (int i = 1; i <= 5; i++) {
           int number = scanner.nextInt();
           sum = sum + number;
           average = sum / i;
        }
        System.out.println(average);
    }
}
