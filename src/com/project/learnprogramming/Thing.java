package com.project.learnprogramming;

public class Thing {


    private String name;
    private String description;

    public Thing(String someName, String someDescription){

        this.description = someDescription;
        this.name = someName;
    }

    public void setName(String someName) {
        this.name = someName;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String someDescription) {
        this.description = someDescription;
    }

    public String getDescription() {
        return description;
    }


}
