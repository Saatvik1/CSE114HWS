package com.company.Eggs;
import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {

        int cEggs;
        int numDozen;
        int numLoose;

        System.out.print("Enter the number of eggs bought: ");

        Scanner scan = new Scanner(System.in);
        cEggs = scan.nextInt();

        numDozen = cEggs / 12;
        numLoose = (cEggs - (12*numDozen));


        System.out.println("You ordered " + cEggs + " eggs. That’s " + numDozen + " dozen at $3.25 per dozen and " + numLoose + " loose eggs at 45 cents for a total of $" + ((numDozen*3.25)+(numLoose*0.45)) + "." );

    }
}
