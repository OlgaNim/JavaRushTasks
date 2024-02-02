package com.javarush.task.pro.task07.task0720;

class GalavirXIII {
    public static int superWeapon = Integer.MAX_VALUE;
    public double health = Double.MAX_VALUE;

    public int defend(double number) {
        int health = (int) (this.health - (superWeapon / number));
        return health;
    }

    public int attack(){
        return superWeapon;
    }

}

/*class GalavirXIII {
    public static int superWeapon = Integer.MAX_VALUE;
    public double health = Double.MAX_VALUE;

    public void defend(double number) {
        health = health - (superWeapon / number);
    }

    public int attack(){
        return superWeapon;
    }

}*/
