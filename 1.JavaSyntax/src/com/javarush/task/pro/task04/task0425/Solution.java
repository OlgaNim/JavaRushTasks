package com.javarush.task.pro.task04.task0425;

/* 
Диггер (1)
*/

public class Solution {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {

        for (int a = 0; a < 10; a++) {
            if (a == 3) {
            System.out.print(robot);
            } else {
                System.out.print(land);
            }
        }
        System.out.println();
       
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(land);
            }
            System.out.println();
        }

        for (int k = 0; k < 1; k++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(bug);
            }
        }
    }
}
