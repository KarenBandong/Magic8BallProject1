package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// PHASE 1 and 2
        int firstNumber, secondNumber, thirdNumber, number;
        String userName, question;

        firstNumber= 30;
        secondNumber= 50;
        thirdNumber= 10;
        Scanner keyboard = new Scanner(System.in);




        if (firstNumber==secondNumber){
            System.out.println(firstNumber+ " is greater than " + secondNumber);
        }
        else {
            System.out.println(firstNumber+ " is less than " + secondNumber);
        }
        if (thirdNumber==firstNumber){
            System.out.println(thirdNumber+ " is greater than and equal to" + firstNumber);
        }
        else if (thirdNumber==secondNumber){
            System.out.println(thirdNumber+ " is equal to " + secondNumber);
        }
        else if (thirdNumber==secondNumber){
            System.out.println(thirdNumber+ " is less than and equal to " + secondNumber);
        }
        if (secondNumber==firstNumber){
            System.out.println(secondNumber+ " is equal to " + firstNumber);
        }
        System.out.println("Hi what is your name?");
        userName=keyboard.nextLine();
        System.out.println("Hi "+ userName+ "!");
        System.out.println("Please ask me a yes/no question.");
        question= keyboard.nextLine();
        System.out.println("Now please give me a number from 1-100");
        number= keyboard.nextInt();
        if (number>= 10){
            System.out.println("That's a great idea!");
        }

        // Ask them their name
        // Make them ask a yes/no question
        // ask a number from 1-100
        // use rational operation
        // use conditional operators








    }
}
