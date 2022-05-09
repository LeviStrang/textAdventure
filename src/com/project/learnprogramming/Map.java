package com.project.learnprogramming;

import java.util.HashMap;

public class Map {

    public Map() {
        HashMap<Coordinates, Room> rooms = new HashMap<Coordinates, Room>();
        rooms.put(new Coordinates(0, 1), new Room("Street", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(0, 0), new Room("StarBucks", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(0, 2), new Room("Escape Room", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(1, 2), new Room("Old Lady's House", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(-1, 2), new Room("Ally", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(-2, 2), new Room("City Limits", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(-3, 2), new Room("Lake", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(-2, 3), new Room("Bridge", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(-2, 4), new Room("Home", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(0, 3), new Room("Basement", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(0, 4), new Room("Tunnel", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(0, 5), new Room("Back Yard", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(1, 5), new Room("Tall Grass Field", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(2, 5), new Room("Vally", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(2, 4), new Room("Cave", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(2, 3), new Room("Coal Mine", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(3, 3), new Room("Lair", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
    }
}
