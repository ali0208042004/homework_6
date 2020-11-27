package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss("Minigun");
        System.out.println(boss.getInfo());
        System.out.println(boss.getBoos() + weaponDamage);

        while (!isFinished()){
            round();
        }
    }
    public static int bossHealth = 500;
    public static int bossDamage = 80;
    public static int heroesHealth = 300;
    public static int heroesDamage = 50;
    public static int weaponDamage = 100;
    public static void printStatistics  (){
        System.out.println("--------------");
        System.out.println("Boss health: " + bossHealth);
        System.out.println("boss damage " + bossDamage);
        System.out.println("Weapon Damage " + weaponDamage);

    }

    public static void round(){
        printStatistics();
        System.out.println("Round was started!");
        bossHit() ;
        heroesHit();
        weaponHit();
        
        printStatistics();
    }
    private static boolean isFinished() {
        if (bossHealth <= 0){
            System.out.println("Heroes won!!!");
            return true;
        }
        if (heroesHealth<= 0 ){
            System.out.println("Boss won!!!");
            return true;
        }
        return false;
    }


    public static void bossHit(){
        for (int i = 0; i < heroesHealth; i++){
            if (heroesHealth > 0 && bossHealth > 0){
                if (heroesHealth - bossDamage < 0){
                    heroesHealth = 0;
                } else heroesHealth= heroesHealth - bossDamage;
            }
        }
    }

    public static void heroesHit(){
        for (int i = 0; i < (heroesDamage); i++){
            if (heroesHealth > 0  && bossHealth  > 0 ){
                if (bossHealth - heroesDamage < 0){
                    bossHealth = 0;
                }else bossHealth = bossHealth - heroesDamage;
            }
        }
    }
    public static void weaponHit(){
        for (int i = 0; i < heroesHealth ; i++) {
            if (heroesHealth > 0 && bossHealth > 0){
                if (heroesHealth - weaponDamage  < 0 ){
                    heroesHealth = 0;
                }else heroesHealth = heroesHealth - weaponDamage;
            }

        }
    }
}
