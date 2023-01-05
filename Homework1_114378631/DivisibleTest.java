package com.company.DivisibleTest;
import java.util.Scanner;

public class DivisibleTest {

    public static void main(String[] args) {

        int userInput;
        boolean fiveCheck = false;
        boolean sixCheck = false;
        boolean bothCheck = false;
        boolean orCheck = false;
        boolean notorCheck = false;
        System.out.print("Enter an integer: ");

        Scanner input = new Scanner(System.in);

        userInput = input.nextInt();

        if(userInput % 5 == 0 | userInput % 6 == 0) {
            if (userInput % 5 == 0 && userInput % 6 == 0) {
                bothCheck = true;
                notorCheck = false;
            } else {
                bothCheck = false;
                notorCheck = true;
            }
            orCheck = true;
        } else {
             bothCheck = false;
             orCheck = false;
             notorCheck = false;
        }

        System.out.println("Is " + userInput + " divisible by 5 and 6? " + bothCheck);
        System.out.println("Is " + userInput + " divisible by 5 or 6? " + orCheck);
        System.out.println("Is " + userInput + " divisible by 5 or 6? but not both? " + notorCheck);
        System.out.println();// make the last part
    }
}
