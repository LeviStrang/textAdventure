package com.project.learnprogramming;

import java.util.*;
import java.util.List;

public class InputHandler {

    public static void userInputHandler(String input){
        List <String> userInput = userInputSplitter(input);
        commandHandler(userInput);

    }


    public static void commandHandler(List <String> liststr) {
        List<String> commands = new ArrayList<>(List.of("take, drop, go, climb, attack, north, south, east, west"));
        List<String> things = new ArrayList<>(List.of("sword, armor, benjemins, north, south, east, west"));
        int currentIndex = findIndex(commands, liststr.toString());
        if (liststr.size() > 2) {
            System.out.println("Sorry! No more than two words at a time!");
        } else {
            String verb = liststr.get(0);
            String noun = liststr.get(1);
            if (!commands.contains(verb)) {
                System.out.println(verb + " is not a verb!");
            } else if (!things.contains(noun)) {
                System.out.println(noun + " is not a noun!");
            }

    switch (currentIndex){
        case 5: Coordinates.addToX();


    }
        }
        System.out.println("Please enter a valid choice.");
    }

    public static List<String> userInputSplitter(String input){

        String charToSpitOn = ",.:;?!\\/[]|@#$%^&*()=+`~";
        List<String> liststr = new ArrayList<>();
        String stringFormat = input.trim().toLowerCase();
        StringTokenizer tokenizer = new StringTokenizer(input, charToSpitOn);
        String s;

        while (tokenizer.hasMoreTokens()){
            s = tokenizer.nextToken();
            liststr.add(s);
        }
        return liststr;
    }

    public static int findIndex(List <String> wordList, String userInput ){
        int i;
        for (i = 0; i < wordList.size();){
            if (wordList.get(i).equals(userInput)){
                break;
            }
            else {
                i++;
            }
        }
        return i;
    }

    public void setScene(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the best 30 min of your life!");
        String userInput = input.nextLine();
        System.out.println("My name is Computron and I will be the voice in your head throughout our adventure." +
                "\nAll movements or actions are executed by typing two word combinations \nex: go north" +
                "\nIf this already sounds boring or if you don't think you can handle the heat, \nYou can always type 'quit' and the game will end." +
                "\nThe ball is in your court, would you like to continue?");
        userInput = input.nextLine();
        if (userInput.equals("yes")){
            System.out.println("great! To get started type 'go north'");
        } else if (userInput.equals("no")){
            System.out.println("Type 'quit' to end the game");
        }else
        {
            System.out.println("Not quite... don't worry, you will learn how to follow instructions. Let's begin the adventure.");
        }
    }


}
