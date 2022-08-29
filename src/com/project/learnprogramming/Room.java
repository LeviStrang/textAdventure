package com.project.learnprogramming;

//import com.project.learnprogramming.Items;

public class Room extends Thing {

    private int n, s, e, w;

//    ArrayList<Items> itemsArrayList = new ArrayList<>();

    public Room (String someName, String someDescription){
        super(someName, someDescription);


    }

    @Override
    public String toString(String someName, String someDescription) {
        return someName + someDescription;
    }

    @Override
    public String toString(Object object) {
        return null;
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
