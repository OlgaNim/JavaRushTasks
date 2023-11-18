package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean pessimist = scanner.nextBoolean();
        if (pessimist == false) {
            glass = Math.floor(glass);
        } else {
            glass = Math.ceil(glass);
        }
        System.out.println((int)glass);
    }
}