package com.project.learnprogramming;

public abstract class CombatItem extends Item {

    int durability;

    public CombatItem(String someName, String someDescription) {
        super(someName, someDescription);
    }

    public abstract void setDurability(int durability);

    public abstract int getDurability();

    public void repairItem(int repairAmount) {
        setDurability(getDurability() + repairAmount);
    }
}
