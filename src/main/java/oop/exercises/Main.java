package oop.exercises;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */
public class Main
{

    public static void main(String[] args) {
        double height, weight, bmi;
        Scanner input;

        input = new Scanner(System.in);

        System.out.print("Enter height in inches: ");
        height = input.nextDouble();
        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble();

        bmi = (weight / (height * height)) * 703;

        System.out.printf("Your BMI is %.1f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight. You should see your doctor.");
        } else if (bmi > 25) {
            System.out.println("You are overweight. You should see your doctor.");
        } else {
            System.out.println("You are within the ideal weight range.");
        }
    }
}
