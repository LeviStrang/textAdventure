package com.project.learnprogramming;

public class Sword extends Weapon{

    public Sword(String someName, String someDescription) {
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
        return durability;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }


}
