package com.project.learnprogramming;

public class Axe extends Weapon{



    public Axe(String someName, String someDescription) {
        super(someName, someDescription);
    }

    @Override
    public int block(int damageGiven) {
        return damageGiven - blockAmount;
    }

    @Override
    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public int getDurability() {
        return 0;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return 0;
    }
}
