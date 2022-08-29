package com.project.learnprogramming;

public class LegPiece extends Armor {

    public LegPiece(String someName, String someDescription) {
        super(someName, someDescription);
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
