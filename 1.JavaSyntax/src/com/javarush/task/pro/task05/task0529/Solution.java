package com.javarush.task.pro.task05.task0529;

import java.util.Arrays;

/* 
Галаксианские роботанки (1)
*/

public class Solution {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static String[][] field = new String [height][width];

    public static void main(String[] args) {
        for (int i = 0; i < height; i++) {
            int x = (int) (Math.random() * width);
            for (int j = 0; j < width; j++) {
                field[i][j] = empty;
                //System.out.print(field[i][j]);
            }
            //System.out.println();
            field[i][x] = robotank;
        }
        for (int k = 0; k < field.length; k++) {
            for (int m = 0; m < width; m++) {
                System.out.print(field[k][m]);
            }
            System.out.println();
        }
    }
}
