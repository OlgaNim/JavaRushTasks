package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;

/* 
Есть ли кто?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;
    public static int[] sort() {
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        isElement();

    }

    public static void isElement() {
        int result = Arrays.binarySearch(sort(), element);
        if (result >= 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
