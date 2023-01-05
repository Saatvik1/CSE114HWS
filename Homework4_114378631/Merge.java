package com.company.HW4Q2;
import java.util.Scanner;
import java.util.Arrays;

// Saatvik Sandal 114378631

public class Merge {

    public static void main(String[] args) {

        System.out.println("Enter array 1: ");
        Scanner Array1Length = new Scanner(System.in);
        int element1 = Array1Length.nextInt();
        int[] list1 = new int[element1];

        for(int i = 0; i<element1; i++) {
            list1[i] = Array1Length.nextInt();
        }

        System.out.println("Enter array 2: ");
        Scanner Array2Length = new Scanner(System.in);
        int element2 = Array2Length.nextInt();

        int[] list2 = new int[element2];

        for(int i = 0; i<element2; i++) {
            list2[i] = Array2Length.nextInt();
        }

            for(int i = 0; i<merge(list1, list2).length; i++) {
                System.out.print(merge(list1,list2)[i] + " ");
            }
    }

    public static int[] merge(int[] list1, int[] list2) {

        int[] newList = new int[list1.length + list2.length];

            int j = 0;
            while(j<list1.length) {
                newList[j] = list1[j];
                j++;
            }

            int k = 0;
            while(k<list2.length) {
                newList[j] = list2[k];
                k++;
                j++;
            }



            Arrays.sort(newList);

            return newList;
    }

}
