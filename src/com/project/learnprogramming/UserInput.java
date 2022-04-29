package com.project.learnprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class UserInput {

    public static List<String> listOfWords(String input){

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
}
