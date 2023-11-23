package com.javarush.task.pro.task05.task0508;

import java.util.Arrays;
import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

//задача в процессе решение


public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine();
            //System.out.print(strings[i] + ", ");
        }

        //два вложенных цикла со сравнением
        //одинаковые записывать в новые переменные, в конце чтобы всем этим данным присвоить налл

        for (int j = 0; j < strings.length; j++) {
            for (int k = 0; k < strings.length; k++) {
                if (strings[j] == strings[k] && j != k) {
                    strings[k] = null;


                }

                }
                }
            }

        }System.out.print(strings[k] + ", ");
//        for (int b = 0; b < strings.length; b++) {
//            if (strings[b].equals("null")) {
//                strings[b] = null;
//            } System.out.print(strings[b] + ", ");
        }


        //String stringsToOutput = Arrays.toString(strings);
        //System.out.print(stringsToOutput);

    }
//}
//for (int j = 0; j < strings.length; j++) {
//        for (int k = 0; k < strings.length; k++) {
//        if (strings[j].equals(strings[k]) && j != k && strings[j] != null && strings[k] != null) {
//        strings[k] = null;
//
//        strings[j] = "null";
//        strings[k] = "null";
//        }System.out.print(strings[k] + ", ");
//        }
//
//        }
//        for (int b = 0; b < strings.length; b++) {
//            if (strings[b].equals("null")) {
//                strings[b] = null;
//            } System.out.print(strings[b] + ", ");
//        }


//String stringsToOutput = Arrays.toString(strings);
//System.out.print(stringsToOutput);
