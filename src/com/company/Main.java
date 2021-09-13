/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Diego Santiago
 */

// I believe the test cases on the worksheet were incorrect, I plugged the values into a calculator and got the same as my project

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        Double r = null;

        //sex
        System.out.print("Enter 1 if you are male or 2 if you are female: ");
        String s1 = x.nextLine();
        Double sex = null;
        try {
            sex = Double.valueOf(s1);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }

        if(sex==1){
            r=0.73;
        }else if(sex==2){
            r=0.66;
        }else{
            System.out.println("Please enter either 1 or 2.");
            System.exit(0);
        }

        //ounces
        System.out.print("How many ounces of alcohol did you have? ");
        String s2 = x.nextLine();
        Double ounce = null;
        try {
            ounce = Double.valueOf(s2);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }

        //weight
        System.out.print("What is your weight in pounds? ");
        String s3 = x.nextLine();
        Double weight = null;
        try {
            weight = Double.valueOf(s3);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }

        //hours
        System.out.print("How many hours has it been since your last drink? ");
        String s4 = x.nextLine();
        Double hours = null;
        try {
            hours = Double.valueOf(s4);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }

        double bac = ((ounce*5.14)/(weight*r))-0.015*hours;
        System.out.println("\r\nYour BAC is "+bac);
        if(bac<0.08){
            System.out.println("It is legal for you to drive.");
        }else{
            System.out.println("It is not legal for you to drive.");
        }

        // I believe the test cases on the worksheet were incorrect, I plugged the values into a calculator and got the same as my project

        System.exit(0);
    }
}
