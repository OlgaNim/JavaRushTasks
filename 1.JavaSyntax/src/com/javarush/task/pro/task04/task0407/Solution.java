package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/


public class Solution {
    public static void main(String[] args) {
        int number = 0;
        int sum = 0;
        while (number < 101) {
            if (number % 3 != 0 ) {
                sum = sum + number;
            } number++;
            continue;
        }
        System.out.println(sum);

    }
}