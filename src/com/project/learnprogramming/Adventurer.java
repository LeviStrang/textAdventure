package com.project.learnprogramming;

public class Adventurer {

    //Move method - allows adventurer to move north, west, east, or south

    //Take method - adds item to inventory

    //Drop method - drops item from inventory

    //Look method - lists items in inventory

    //Inspect method - gives description of certain item in inventory

    // Location method - returns the current location of adventurer

    private int attackDamage;
    private int health;
    private String name;
    private int poundsOfFood;
    private boolean weaponEquipped;
    private boolean hasWeapon;
    private boolean hasArmour;
    private Armour armour;
    private Weapon weapon;
    private Wallet wallet;


    public Adventurer()
    {
        attackDamage = 25;
        health = 100;
        name = "";
        poundsOfFood = 0;
        weaponEquipped = false;
        hasWeapon = false;
        hasArmour = false;
        armour = null;
        weapon = null;
        wallet = new Wallet();

    }

}