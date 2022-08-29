package com.project.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        System.out.print("$ ");
        String userName = input.nextLine();
        InputHandler inputHandler = new InputHandler();
        Adventurer adventurer = new Adventurer("","");
        GameMap map = new GameMap();
        String userInput;
        inputHandler.setScene();
        map.printCurrentRoom(adventurer.getLocation());

//        GameMap.CSVReader();

        do {
            System.out.print("$ ");
            userInput = input.nextLine();
            InputHandler.userInputHandler(userInput);
        }

        while (!"quit".equals(userInput) || adventurer.getHealth() > 0);
        //look into using Enums for n s e w
    }
}