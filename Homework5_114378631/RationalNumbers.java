package com.company.HW5Q2;
//Saatvik Sandal 114378631
import java.util.Scanner;

public class RationalNumbers {

    public static void main(String[] args) {
        System.out.println("Enter the numerator for the first rational number: ");
        Scanner input = new Scanner(System.in);
        int numerator = input.nextInt();
        System.out.println("Enter a non zero denominator for the first rational number: ");
        int denominator = input.nextInt();
        Rational one = new Rational(numerator,denominator);

        System.out.println("Enter the numerator for the second rational number: ");
        numerator = input.nextInt();
        System.out.println("Enter a non zero denominator for the second rational number: ");
        denominator = input.nextInt();
        Rational two = new Rational(numerator,denominator);

        String oneVal = one.toString();
        String twoVal = two.toString();
        String oneAtwo = Rational.addition(one,two).toString();
        String oneStwo = Rational.subtraction(one,two).toString();
        String oneMtwo = Rational.multiplication(one,two).toString();
        String oneDtwo = Rational.division(one,two).toString();

        System.out.println("First num is: " + oneVal);
        System.out.println("Second num is: " + twoVal);
        System.out.println("Addition: " + oneAtwo);
        System.out.println("Subtraction: " + oneStwo);
        System.out.println("Multiplication: " + oneMtwo);
        System.out.println("Division: " + oneDtwo);

    }
}
