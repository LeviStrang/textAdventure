package com.project.learnprogramming;

public abstract class Weapon {


    private int durability;
    private String name;
    private int maxDamage = 150;
    private int damage;

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


