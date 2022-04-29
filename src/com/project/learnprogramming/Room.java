package com.project.learnprogramming;

public class Room extends Thing {

    private int n, s, e, w;

    public Room (String someName, String someDescription, int north, int south, int east, int west){
        super(someName, someDescription);

        this.n = north;
        this.s = south;
        this.w = west;
        this.e = east;
    }

    public int getN() {
        return n;
    }

    public void setN(int north) {
        this.n = north;
    }

    public int getS() {
        return s;
    }

    public void setS(int south) {
        this.s = south;
    }

    public int getE() {
        return e;
    }

    public void setE(int east) {
        this.e = east;
    }

    public int getW() {
        return w;
    }

    public void setW(int west) {
        this.w = west;
    }
}
