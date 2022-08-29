package com.project.learnprogramming;

public abstract class Item{

    private String name;
    private String description;
    int weight;

    public Item(String someName, String someDescription) {
        this.description = someDescription;
        this.name = someName;

        }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void setWeight(int weight);

    public abstract int getWeight();

}

