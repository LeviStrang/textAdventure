package com.project.learnprogramming;

public abstract class Armour {

    private int durability;
    private String name;
    private int maxBlockableDamage;
    private int blockedDamage;

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

    public int getBlockedDamage() {
        return blockedDamage;
    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }
    public void repairArmour(int repairAmount){
        setDurability(durability + repairAmount);
    }
}
