package com.company.HW2Q41;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Enter the string");
        Scanner input1 = new Scanner(System.in);
        String palindrome = input1.nextLine();

        String level1 = palindrome.toLowerCase();
        String level2 = level1.replaceAll(" ", "");

       int length = level2.length();

       String check1 = "";
       String check2 = "";

       for(int i = 0; i<length; i++) {
           check1+= level2.charAt(i);
       }
        System.out.println(check1);
       for(int k = length; k>0;) {
           k--;
           check2 += level2.charAt(k);
       }

       if(check1.equals(check2)) {
           System.out.println(level2 + " is a palindrome");
       } else {
           System.out.println("Is not a palindrome");
       }

    }
}
