package com.project.learnprogramming;

public class Coordinates {

    private  int x;
    private  int y;

    public Coordinates(int x, int y){

    }

    public void setX(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y){
        this.y = y;
    }


    public int getY() {
        return y;
    }

    public void addToY(){
        setY(this.y + 1);

    }
    public void subFromY(){
        setY(this.y - 1);
    }

    public void addToX(){
        setY(this.x + 1);

    }
    public void subFromX(){
        setY(this.x - 1);
    }

}
