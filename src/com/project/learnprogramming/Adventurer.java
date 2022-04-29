package com.project.learnprogramming;

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
    private Armour armour;
    private Weapon weapon;
    private Wallet wallet;
    private Room location;


    public Adventurer(String someName, String someDescription, Room someRoom)
    {
        super(someName, someDescription);

        attackDamage = 25;
        health = 100;
        poundsOfFood = 0;
        weaponEquipped = false;
        hasWeapon = false;
        hasArmour = false;
        armour = null;
        weapon = null;
        wallet = new Wallet("Walter the Wallet", "It's brown... \nIt's a wallet... \nwhat did you expect to hear?");
        location = someRoom;

    }

    public void setLocation(Room location) {
        this.location = location;
    }

    public Room getLocation(){
        return location;
    }
}