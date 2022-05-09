package com.project.learnprogramming;

import java.awt.*;

public class Room extends Thing {

    private int n, s, e, w;

    public Room (String someName, String someDescription){
        super(someName, someDescription);

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
