package com.company.WindChill;
import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {

        double outTemp;
        double windSpeed;
        double windChill;

        System.out.print("Enter a temperature between -58 and 41 Fahrenheit and enter a wind speed greater than or equal 2: ");

        Scanner input = new Scanner(System.in);
        outTemp = input.nextDouble();
        windSpeed = input.nextDouble();

        //System.out.print (outTemp + " " + windSpeed);

        windChill = 35.74 + 0.6215*(outTemp) - (35.75 * (Math.pow(windSpeed, 0.16))) + (0.4275 * outTemp * (Math.pow(windSpeed, 0.16)));

        System.out.println("The wind chill temperature is: " + windChill + "F");



    }
}
