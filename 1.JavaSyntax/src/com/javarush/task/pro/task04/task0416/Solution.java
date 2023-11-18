package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cola = sc.nextInt();
        int people = sc.nextInt();
        System.out.println(1.0 * cola / people);

    }
}