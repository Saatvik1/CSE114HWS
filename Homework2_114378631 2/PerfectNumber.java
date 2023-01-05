package com.company.HW2Q1;
import java.util.Scanner;
public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println("Enter the upper limit: ");
        Scanner input1 = new Scanner(System.in);
        int limit = input1.nextInt();


        for(int i = 1; i<limit;i++) {
           int num = 0;

            for(int j = 1; j<i; j++) {
                if(i%j == 0){
                    num += j;
                }
            }
            if (num ==  i) {
                System.out.println(i);
            }
        }

    }
}
