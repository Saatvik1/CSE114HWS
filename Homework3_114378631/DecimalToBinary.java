package com.company.Homework3Q3;
import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.println("Enter the decimal number");
        Scanner input = new Scanner(System.in);
        int valInput = input.nextInt();

        System.out.println(dec2Bin(valInput));
    }

    public static String dec2Bin(int value) {
        String finBinNum = "";
        while(value >= 2) {
            finBinNum = "" + (value%2) + finBinNum;
            value /= 2;
        }
        finBinNum = "" + value + finBinNum;
        return finBinNum;
    }
}
