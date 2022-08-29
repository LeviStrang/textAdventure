package com.project.learnprogramming;

public abstract class Weapon extends CombatItem{


    private int damage;
    private float critMultiplier;
    private float critChance;
    int blockAmount;

    public Weapon(String someName, String someDescription) {
        super(someName, someDescription);
    }

    public int getDamage() {
        return damage;
    }

    public float getMaxDamage() {
         return damage * critMultiplier;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public abstract int block( int damageGiven);


}


