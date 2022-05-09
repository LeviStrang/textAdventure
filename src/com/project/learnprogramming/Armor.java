package com.project.learnprogramming;

public abstract class Armor extends Thing {

    private int durability;
    private int maxBlockableDamage;
    private int blockedDamage;

    public Armor(String someName, String someDescription) {
        super(someName, someDescription);
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
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
