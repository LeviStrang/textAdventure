package com.project.learnprogramming;

public class Coordinates {

    private int x;
    private int y;

    public Coordinates(int x, int y){
    this.x = x;
    this.y = y;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Coordinates)){
            return false;
        }
        Coordinates moreCoordinates = (Coordinates) obj;
        return (moreCoordinates.getX() == this.x && moreCoordinates.getY() == this.y);
    }
    @Override
    public int hashCode(){
        return x + y;
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
