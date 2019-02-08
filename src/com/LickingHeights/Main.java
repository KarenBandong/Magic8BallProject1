package com.LickingHeights;

public class Main {

    public static void main(String[] args) {
	// PHASE 1 and 2
        int firstNumber, secondNumber, thirdNumber;

        firstNumber= 30;
        secondNumber= 50;
        thirdNumber= 10;


        if (firstNumber>secondNumber){
            System.out.println(firstNumber+ " is greater than " + secondNumber);
        }
        else {
            System.out.println(firstNumber+ " is less than " + secondNumber);
        }
        if (thirdNumber>=firstNumber){
            System.out.println(thirdNumber+ " is greater than and equal to" + firstNumber);
        }
        else if (thirdNumber==secondNumber){
            System.out.println(thirdNumber+ " is equal to " + secondNumber);
        }
        else if (thirdNumber<=secondNumber){
            System.out.println(thirdNumber+ " is less than and equal to " + secondNumber);
        }
        if (secondNumber==firstNumber){
            System.out.println(secondNumber+ " is equal to " + firstNumber);
        }

        


    }
}
