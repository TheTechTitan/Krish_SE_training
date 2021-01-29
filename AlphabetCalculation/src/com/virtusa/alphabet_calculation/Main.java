package com.virtusa.alphabet_calculation;

import com.virtusa.alphabetmap.AlphabetMap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userInput;
        int total=0;
        AlphabetMap alphabetMap=new AlphabetMap();


        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter sentence: ");
        userInput=scanner.nextLine().trim().toLowerCase();


        for (char value: userInput.toCharArray()){
            total+=alphabetMap.calculateAlphabet(value);
        }


        System.out.println("Your sentence is "+userInput);
        System.out.println("Your Total is "+ total);

    }
}
