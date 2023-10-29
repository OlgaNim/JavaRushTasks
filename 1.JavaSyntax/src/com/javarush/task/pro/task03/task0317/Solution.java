package com.javarush.task.pro.task03.task0317;

import java.util.Scanner;

/* 
Пищевой конвеер
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            int number = sc.nextInt();
            if (number > 0) {
                System.out.println(number);
            }
        }

    }
}
