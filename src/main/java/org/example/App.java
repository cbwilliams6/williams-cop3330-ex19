package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        boolean test = false;
        double height = 0, weight = 0, bmi;

        do {
            try {
                System.out.print("Enter your height: ");
                height = input.nextInt();
                test = true;
            } catch (InputMismatchException e) {
                System.out.println("You have to enter a number...");
                input.nextLine();
            }
        } while(!test);

        do {
            try {
                System.out.print("Enter your weight: ");
                weight = input.nextInt();
                test = true;
            } catch (InputMismatchException e) {
                System.out.println("You have to enter a number...");
                input.nextLine();
            }
        } while(!test);

        bmi = (weight / (height * height)) * 703;
        System.out.println("Your BMI is " + String.format("%.1f", bmi) + ".");

        if (bmi >= 18.5 && bmi <= 25){
            System.out.println("You are within the ideal weight range.");
        }
        else if(bmi < 18.5){
            System.out.println("You are underweight. You should see your doctor.");
        }
        else{
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}