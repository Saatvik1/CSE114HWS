package com.company.HW4Q3;
import java.util.Scanner;

// Saatvik Sandal 114378631

public class BubbleSort {

    public static void main(String[] args) {

        System.out.println("Enter the 10 strings: ");
        String[] list = new String[10];
        for(int i =0; i<list.length; i++ ) {
            Scanner input = new Scanner(System.in);
            list[i] = input.nextLine();
        }

        for(int i =0; i<list.length; i++)
        System.out.print(bubbleSort(list)[i] + " ");

    }
    public static String[] bubbleSort(String[] list) {
        boolean inOrderVal = false;
        while(!inOrderVal) {
            boolean orderedMaybe = true;
            for(int i = 0; i<list.length-1; i++ ) {
                if(!alphabetCheck(list[i], list[i+1])[0].equals(list[i])) {
                    String tempVal = list[i];
                    list[i] = list[i+1];
                    list[i+1] = tempVal;
                    orderedMaybe = false;
                }
            }
            if(orderedMaybe) {
                inOrderVal = true;
            }

        }
            return list;
    }

    public static String[] alphabetCheck(String Word1, String Word2) {
        String [] ordered = new String[2];

        int smallerWord = Math.min(Word1.length(),Word2.length());

        for(int i = 0; i<smallerWord; i++) {
            if(Word1.charAt(i) < Word2.charAt(i)) {
                ordered[0] = Word1;
                ordered[1] = Word2;
                break;
            } else if(Word1.charAt(i) > Word2.charAt(i)) {
                ordered[0] = Word2;
                ordered[1] = Word1;
                break;
            } else {
                ordered[0] = Word2;
                ordered[1] = Word1;
            }
        }


        return ordered;
    }
}
