package com.company.HW2Q3;
import java.util.Scanner;

public class LargestCommonPrefix {

    public static void main(String[] args) {

        boolean check = true;

        System.out.println("Enter the first string: ");
        Scanner input1 = new Scanner(System.in);
        String bee = input1.nextLine();

        System.out.println("Enter the second string: ");
        Scanner input2 = new Scanner(System.in);
        String boo = input2.nextLine();

        int string1Length = bee.length();
        int string2Length = boo.length();
        int minimum = Math.min(string1Length, string2Length);
        String prefix = "";


            for (int i = 0; i < minimum; i++) {
                if (bee.charAt(i) == boo.charAt(i)) {
                    prefix += bee.charAt(i);
                } else {
                    i = minimum;
                }
            }


        if(prefix.equals("")) {
            System.out.println("No prefix");
        } else {
            System.out.println(prefix);
        }

    }
}
