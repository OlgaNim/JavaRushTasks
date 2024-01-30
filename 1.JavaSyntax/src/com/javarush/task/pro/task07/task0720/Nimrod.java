package com.javarush.task.pro.task07.task0720;

public class Nimrod {
    public static int laser = 100000;
    public static int rocket = 10000;
    public static int angelicaKiss;
    public static int health = 1000000;

    public static void defend(int number) {
        health = health - number;
    }

    public int attack() {
        return rocket;
    }

}

