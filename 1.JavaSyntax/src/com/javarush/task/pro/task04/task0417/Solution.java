package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialSpeed = sc.nextInt();
        double intermediateSpeed = 3.6 * initialSpeed;
        System.out.println(Math.round(intermediateSpeed));
    }
}