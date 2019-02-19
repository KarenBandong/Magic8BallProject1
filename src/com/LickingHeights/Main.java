package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// PHASE 1 and 2
        int  number, option;
        String userName, question1, question2;


        Scanner keyboard = new Scanner(System.in);


        System.out.println("Hi what is your name?");
        userName=keyboard.nextLine();
        System.out.println("Hi "+ userName+ "!");
        System.out.println("If your question is more than one or \nincludes OR option type 2, other else type 1");
        option= keyboard.nextInt();
        keyboard.nextLine();
        if(option == 1){
            System.out.println("Please ask me a yes/no question");
            question1= keyboard.nextLine();
            System.out.println("Now please give me a number from 1-100");
            number= keyboard.nextInt();
            yesNoAnswer(number);

        }else {
            System.out.println("Please state an action that you want to do");
            question1 = keyboard.nextLine();
            System.out.println("Please another action that you want to do");
            question2 = keyboard.nextLine();
            System.out.println("I will now tell you what is the better option; however, please provide me with a number from 1-100");
            number= keyboard.nextInt();

            String bestOption = orAnswer(question1,question2);

            System.out.println("The best option to do would be the "+ bestOption);



        }









    }

    public static String orAnswer(String question1, String question2){
        double option = Math.random()*100;

        if(option <50){
            return question1;
        }
        else{
            return question2;
        }


    }

    public static void yesNoAnswer(int number) {
        if (number >= 1 && number <= 10) {
            System.out.println("Most likely");
        } else if (number >= 11 && number <= 20) {
            System.out.println("Don't count on it");
        } else if (number >= 21 && number <= 30) {
            System.out.println("Yes!");
        } else if (number >= 31 && number <= 40) {
            System.out.println("No");
        } else if (number >= 41 && number <= 50) {
            System.out.println("Definitely!");
        } else if (number >= 51 && number <= 60) {
            System.out.println("Absolutely!");
        } else if (number >= 61 && number <= 70) {
            System.out.println("Very doubtful");
        } else if (number >= 71 && number <= 80) {
            System.out.println("I will say NO to this");
        } else if (number >= 81 && number <= 90) {
            System.out.println("Outlook not so great");
        } else if (number >= 91 && number <= 100) {
            System.out.println("It is decidedly so");
        } else if (number >= 101 && number <= 110) {
            System.out.println("Please ask again later");
        } else if (number >= 111 && number <= 120) {
            System.out.println("I am still deciding at the moment");
        }
    }

}
