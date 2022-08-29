package com.project.learnprogramming;

public class Wallet extends Item {

    private int benjamins;

    public Wallet(String someName, String someDescription){
    super(someName, someDescription);
        benjamins = 0;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public int getBenjamins() {
        return benjamins;
    }

    public void setBenjamins(int benjamins) {
        this.benjamins = benjamins;
    }

    public void addBenjamins(int benjamins){
        this.benjamins += benjamins;
    }

    public void removeBenjamins (int benjamins){
        if(benjamins > 0){
            this.benjamins -= benjamins;
        }
        else {
            benjamins = 0;
        }
    }
}
