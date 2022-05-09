package com.project.learnprogramming;

import java.util.*;
import java.util.List;
import com.project.learnprogramming.Coordinates;

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

    public Adventure(String userName) {

        Map map = new Map();
        Adventurer adventurer = new Adventurer(userName, "You are just a person");
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
