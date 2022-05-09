package com.project.learnprogramming;

import com.project.learnprogramming.Adventure;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("What is your name?");
        System.out.print("$ ");
        String userName = input.nextLine();
        Adventure adventure = new Adventure(userName);
        String userInput;
        adventure.setScene();

        do {
            System.out.print("$ ");
            userInput = input.nextLine();
            System.out.println(userInput);
        }

        while (!"quit".equals(userInput));

    }

}