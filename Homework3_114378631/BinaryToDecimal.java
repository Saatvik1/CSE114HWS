package com.company.Homework3Q4;
import java.util.Scanner;
public class BinaryToDecimal {

    public static void main(String[] args) {

        System.out.println("Enter the binary number: ");
        Scanner input = new Scanner(System.in);
        String binString = input.nextLine();

        System.out.println(bin2Dec(binString));
    }
    public static int bin2Dec(String binaryString) {
        int finBinVal;
        String decVal = "" + binaryString.charAt(0);
        binaryString = binaryString.substring(1);

        for(int i = 0; i< binaryString.length(); i++) {
            decVal = "" +  (Integer.parseInt(decVal)*2 );
            int decValTemp = Integer.parseInt(decVal) + Integer.parseInt("" +binaryString.charAt(i));
            decVal = "" + decValTemp;
        }
        finBinVal = Integer.parseInt(decVal);
        return finBinVal;
    }
}
