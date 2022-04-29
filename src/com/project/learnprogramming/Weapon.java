package com.project.learnprogramming;

public abstract class Weapon extends Thing {


    private int durability;
    private int maxDamage = 150;
    private int damage;

    public Weapon(String someName, String someDescription) {
        super(someName, someDescription);
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void repairWeapon(int repairAmount){
        setDurability(durability + repairAmount);
    }
}


