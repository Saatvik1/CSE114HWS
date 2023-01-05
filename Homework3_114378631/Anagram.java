package com.company.Homework3Q2;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        System.out.println("Enter the first string: ");
        Scanner input1 = new Scanner(System.in);
        String fString = input1.nextLine();

        System.out.println("Enter the second string");
        Scanner input2 = new Scanner(System.in);
        String sString = input2.nextLine();


        if(anagramCheck(fString, sString)) {
            System.out.println(fString + " and " + sString + " are both anagrams");
        } else {
            System.out.println(fString + " and " + sString + " are not anagrams");
        }


    }

    public static boolean anagramCheck(String a, String b) {
       boolean isAnagram = true;
        a = a.replace(" ", "");
        b = b.replace(" ", "");
        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() == b.length()) {
            for (int i = 0; i<a.length(); i++) {

                String check = ""+a.charAt(i);
                String aReplace = a.replace(check,"");
                int aRepeat = a.length() - aReplace.length();

                String bReplace = b.replace(check, "");
                int bRepeat = b.length() - bReplace.length();

                if(aRepeat != bRepeat) {
                    return isAnagram = false;
                }
            }



        } else {
            return isAnagram = false;
        }


        return  isAnagram;
    }

}
