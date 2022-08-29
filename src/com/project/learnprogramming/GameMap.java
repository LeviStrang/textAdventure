package com.project.learnprogramming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import com.project.learnprogramming.Coordinates;

public class GameMap {

    HashMap<Coordinates, Room> rooms = new HashMap<>();

    public GameMap() {


        rooms.put(new Coordinates(0, 1), new Room("Street", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(0, 0), new Room("StarBucks", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream."));
        rooms.put(new Coordinates(0, 2), new Room("Escape Room", "After a for step and the use of an odd door, you find yourself locked in a red low lit room.  " +
                "\nPuzzles are fun right?"));
        rooms.put(new Coordinates(1, 2), new Room("Old Lady's House", "After walking up a short and creaky stairway, you are greeted by an old lady holding a plate of cookies. " +
                "\nPorcelin dolls, musty sheets, and an old mean dog who has a pungent smell resembling the mixing of beef jerky and toe jam... " +
                "\nJust like Grandma's house."));
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

    public void printCurrentRoom(Coordinates location){
        Room room = rooms.get(location);


      String roomString = "Current room = " + room.getName() + "\n" + room.getDescription();
        System.out.println(roomString);
    }


    public static void CSVReader() {
        String s = "\\C:\\Users\\Levis\\Desktop\\JavaPrograms\\TextAdventure\\src\\com\\project\\learnprogramming\\mapDemo.csv\\";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(s));

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
