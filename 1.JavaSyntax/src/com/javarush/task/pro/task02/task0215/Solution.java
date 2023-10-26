package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        System.out.println((number1 + number2 + number3) / 3);
    }
}
