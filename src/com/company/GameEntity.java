package com.company;

public class GameEntity {
    private String boss;
    private String heroes;
    public static int weaponDamage = 100;

    public GameEntity() {
        System.out.println(boss + weaponDamage);

    }


    public String getBoos() {
        return boss;
    }

    public void setBoos(String boos) {
        this.boss = boss;
    }

    public String getHeroes() {
        return heroes;
    }

    public void setHeroes(String heroes) {
        this.heroes = heroes;

    }

    public String getInfo(){return boss + " " + heroes;}
}

