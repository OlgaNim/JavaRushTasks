package com.javarush.task.pro.task07.task0720;

class Nimrod {
    public static int laser = 100000;
    public static int rocket = 10000;
    public static int angelicaKiss;
    public int health = 1000000;

    public void defend(int damage) {
        health = health - applyShield(damage);
    }

    public int attack() {
        return rocket;
    }

    public byte applyShield(int damage) {
        return (byte) damage;
    }

}

