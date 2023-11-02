package com.javarush.task.pro.task04.task0419;

import java.util.Scanner;

/* 
Защита от землетрясения
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int a = 0;
        while (a < number) {
            a++;
            sum = sum + a;
        }
        System.out.println(sum);
    }
}