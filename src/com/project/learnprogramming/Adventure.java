package com.project.learnprogramming;

import java.util.*;

public class Adventure {


    public static List<String> userInputFormatter(String input){

        String charToSpitOn = ",.:;?!\\/[]|@#$%^&*()=+`~";
        List<String> liststr = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(input, charToSpitOn);
        String s;

        while (tokenizer.hasMoreTokens()){
            s = tokenizer.nextToken();
            liststr.add(s);
        }
        return liststr;
    }

//    public String caseFormatter(String userInput) {
//        List<String> listOfWords;
//
//        String response = "sure";
//        String stringFormat = userInput.trim().toLowerCase();
//
//        if (!stringFormat.equals("q")) {
//            if (stringFormat.equals("")) {
//                System.out.println("lets not waste time... type something");
//            } else {
//                listOfWords = listWithWords(stringFormat);
////                response = readInput(listOfWords);
//            }
//        }
//        return response;
//    }

    private ArrayList<Room> map;

    public Adventure() {

        map = new ArrayList<Room>();

        int deadEnd = -1;

        map.add(new Room("Street", "You find yourself standing on the sidewalk just outside a Starbucks. " +
                "\nDon't worry, no one judges you for being addicted to coffee... " +
                "\nThat's all part of the American Dream.", 2, 1, deadEnd, deadEnd)); //0
        map.add(new Room("StarBucks","description", 0, deadEnd, deadEnd, deadEnd)); //1
        map.add(new Room("Escape Room","You walk into what looks to be a run down warehouse. " +
                "\nIn front of you, you see a flimsy folding table with a man behind it giving you the stink eye.", 9, 0, 3, 4)); //2
        map.add(new Room("Old Lady's House","description", deadEnd, deadEnd, deadEnd, 2)); //3
        map.add(new Room("Ally","description", deadEnd, deadEnd, 2, 5)); //4
        map.add(new Room("City Limits","description", 7, deadEnd, 4, 6)); //5
        map.add(new Room("Lake","description", deadEnd, deadEnd, 5, deadEnd)); //6
        map.add(new Room("Bridge","description", 8, 5, deadEnd, deadEnd)); //7
        map.add(new Room("Home","description", deadEnd, 7, deadEnd, deadEnd)); //8
        map.add(new Room("Basement","description", 10, 2, deadEnd, deadEnd)); //9
        map.add(new Room("Tunnel","description", 11, 9, deadEnd, deadEnd)); //10
        map.add(new Room("Back Yard","description", deadEnd, 10, 12, deadEnd)); //11
        map.add(new Room("Tall Grass Field","description", deadEnd, deadEnd, 12, 11)); //12
        map.add(new Room("Vally","description", deadEnd, 14, deadEnd, 12)); //13
        map.add(new Room("Cave","description", 13, 15, deadEnd, deadEnd)); //14
        map.add(new Room("Coal Mine","description", 14, deadEnd, 16, deadEnd)); //15
        map.add(new Room("Lair","description", 1, 2, 3, 4)); //16

    }

    public void setScene(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the best 30 min of your life! To get started, please tell me your name:");
        String userInput = input.nextLine();
        System.out.println("That's a nice name...\nIt's great to have you! This is an adventure staring you: "
                + userInput + "\nMy name is Computron and I will be the voice in your head throughout our adventure." +
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
            System.out.println("Your Language is unacceptable, try again.");
        }
    }


}
