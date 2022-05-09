package com.project.learnprogramming;

import java.util.HashMap;

public class Adventurer extends Thing {

    //Move method - allows adventurer to move north, west, east, or south

    //Take method - adds item to inventory

    //Drop method - drops item from inventory

    //Look method - lists items in inventory

    //Inspect method - gives description of certain item in inventory

    // Location method - returns the current location of adventurer

    private int attackDamage;
    private int health;
    private int poundsOfFood;
    private boolean weaponEquipped;
    private boolean hasWeapon;
    private boolean hasArmour;
    private Armor armor;
    private Weapon weapon;
    private Wallet wallet;
    private Coordinates location;


    public Adventurer(String someName, String someDescription)
    {
        super(someName, someDescription);

        attackDamage = 25;
        health = 100;
        poundsOfFood = 0;
        weaponEquipped = false;
        hasWeapon = false;
        hasArmour = false;
        armor = null;
        weapon = null;
        wallet = new Wallet("Walter the Wallet", "It's brown... \nIt's a wallet... \nwhat did you expect to hear?");
        location = new Coordinates (0,1);


    }

    public void move(String input){

        if (input.contentEquals( "north")){
            location.addToY();
        }
        else if (input.contentEquals("south")){
            location.subFromY();
        }
        else if (input.contentEquals("east")){
            location.addToX();
        }
        else if (input.contentEquals("west")){
            location.subFromX();
        }
    }

    public void setLocation(Coordinates location) {
        this.location = location;
    }

    public Coordinates getLocation(){
        return location;
    }
}