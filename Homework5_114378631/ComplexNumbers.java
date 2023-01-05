package com.company.HW5Q1;
//Saatvik Sandal 114378631
import java.util.Scanner;

public class ComplexNumbers {

    public static void main(String[] args) {
        Complex num1 = new Complex();
        System.out.println("Enter the realPart of the first number: ");
        Scanner input = new Scanner(System.in);
        num1.setRealPart(input.nextDouble());
        System.out.println("Enter the imaginaryPart of the first number: ");
        num1.setImaginaryPart(input.nextDouble());


        Complex num2 = new Complex();
        System.out.println("Enter the realPart of the first number: ");
        Scanner input1 = new Scanner(System.in);
        num2.setRealPart(input1.nextDouble());
        System.out.println("Enter the imaginaryPart of the first number: ");
        num2.setImaginaryPart(input1.nextDouble());

        System.out.print("First number is: ");
        Complex.print(num1);

        System.out.print("Second number is: ");
        Complex.print(num2);

        System.out.print("Addition of complex number is: ");
        Complex.print(Complex.add(num1,num2));

        System.out.print("Subtraction of the complex number is: ");
        Complex.print(Complex.subtract(num1,num2));


    }
}
