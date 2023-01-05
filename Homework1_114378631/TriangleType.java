package com.company.TriangleType;
import java.util.Scanner;
public class TriangleType {

    public static void main(String[] args) {

    int side1;
    int side2;
    int side3;
    String triType;


        System.out.print("Side 1: ");
        Scanner num1 = new Scanner(System.in);
        side1 = num1.nextInt();

        System.out.print("Side 2: ");
        Scanner num2 = new Scanner(System.in);
        side2 = num2.nextInt();

        System.out.print("Side 3: ");
        Scanner num3 = new Scanner(System.in);
        side3 = num3.nextInt();

        //System.out.println(side1 + " " + side2 + " " + side3);

        if((side1 + side2 >= side3) && (side1 + side3 >= side2) && (side2 + side3 >= side1)) {
            if((side1 == side2) && (side1 == side3)){
                triType = "Equilateral";

            } else if((side1 == side2) | (side1 == side3) | (side2 == side3)) {
                triType = "Isosceles";
            } else {
                triType = "Scalene";
            }
        } else {
            triType = "Invalid";
        }
        System.out.print("Output: " + triType);
    }
}
