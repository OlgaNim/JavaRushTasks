package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        if (Math.abs(number1 - number2) > 0.000001) {
            System.out.println("числа не равны");
        } else {
            System.out.println("числа равны");
        }
    }
}
