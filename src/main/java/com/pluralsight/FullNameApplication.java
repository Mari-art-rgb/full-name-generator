package com.pluralsight;

import java.util.Scanner;

import java.util.regex.Pattern;


public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String hasMiddleName = "None";
        String hasSuffix = "None";



        System.out.print("What is your first name? ");
        String firstName = scan.nextLine();

        System.out.println("What is your middle name (if you do not have one type )");
        String middleName = scan.nextLine();


        System.out.println("What is your last name?");
        String lastName = scan.nextLine();

        System.out.println("If you have a suffix, please add it: ");
        String suffix = scan.nextLine();

        String fullName = " " + firstName + " " +  middleName + " " + lastName + " ," + suffix;

        if (middleName.equalsIgnoreCase((hasMiddleName))) {
            System.out.println(firstName +  " " + lastName);
        } else {
            System.out.println(firstName + " " +  middleName + " " + lastName);
        }


    }
}
