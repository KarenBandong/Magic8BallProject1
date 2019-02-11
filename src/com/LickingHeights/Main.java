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
        if (number>= 1 && number<=10){
            System.out.println("Most likely");
        }
        if (number>=11 && number<=20){
            System.out.println("Don't count on it");
        }
        if (number>=21 && number<=30){
            System.out.println("Yes!");
        }
        if (number>=31 && number<=40){
            System.out.println("No");
        }
        if (number>=41 && number<=50){
            System.out.println("Definitely!");
        }
        if (number>=51 && number<=60){
            System.out.println("Absolutely!");
        }
        if (number>=61 && number<=70){
            System.out.println("Very doubtful");
        }
        if (number>=71 && number<=80){
            System.out.println("I will say NO to this");
        }
        if (number>=81 && number<=90){
            System.out.println("Outlook not so great");
        }
        if (number>=91 && number<=100){
            System.out.println("It is certain");
        }


        // Ask them their name
        // Make them ask a yes/no question
        // ask a number from 1-100
        // use rational operation
        // use conditional operators








    }
}
