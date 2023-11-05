package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var result = 0;
        while (sc.hasNextInt()) {
            int dataInput = sc.nextInt();
            result = result + dataInput;
        }
        System.out.println(result);
    }
}
/*while (!isEnter) {
        var dataInput = sc.nextInt();
        var dataToString = Integer.toString(dataInput);
        isEnter = dataToString.equals("ENTER");
        result = result + dataInput;
        System.out.println(result); */