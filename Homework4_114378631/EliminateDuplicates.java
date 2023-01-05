package com.company.HW4Q1;
import java.util.Scanner;

// Saatvik Sandal 114378631

public class EliminateDuplicates {

    public static void main(String[] args) {

        System.out.println("Enter 10 integers: ");
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];
        for(int i = 0; i<list.length; i++  ) {
            list[i] = input.nextInt();
        }

        for(int i = 0; i<eliminateDuplicates(list).length; i++) {
            System.out.print(eliminateDuplicates(list)[i] + " ");
        }
    }
    public static int[] eliminateDuplicates(int[] list) {

        int[] distinctInts = new int[10];
        int zerCount =0;

        int count = 0;
        for(int i =0; i<list.length; i++) {
            boolean check = true;
            int tempVal = list[i];
            for(int k = 0; k<list.length; k++) {
                if(distinctInts[k] == tempVal) {
                    if(tempVal == 0) {
                        zerCount++;
                        if(zerCount>=2) {
                            check = false;
                            break;
                        }
                        break;
                    }
                    check = false;
                    break;
                }
            }
            if(check) {
                distinctInts[count] = tempVal;
                count++;
            }
        }

        int[] duplicateList = new int[count];

        System.arraycopy(distinctInts, 0, duplicateList, 0, count);

            return duplicateList;
    }
}
