package com.project.learnprogramming;

public class Wallet extends Thing {

    private int benjamins;

    public Wallet(String someName, String someDescription){
    super(someName, someDescription);
        benjamins = 0;
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
