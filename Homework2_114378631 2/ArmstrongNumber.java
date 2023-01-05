package com.company.HW2Q2;
import java.util.Scanner;
public class ArmstrongNumber {

    public static void main(String[] args) {

        boolean check = true;
        boolean check1 = true;
        System.out.println("Enter the upper bound: ");
        Scanner input1 = new Scanner(System.in);
        String upper = input1.nextLine();

        System.out.println("Enter the lower bound: ");
        Scanner input2 = new Scanner(System.in);
        String lower = input2.nextLine();

        int lengthU = upper.length();
        int lengthL = lower.length();

        for(int b = lengthU; b>0;) {
            b--;
            if(upper.charAt(b) >= '0' && upper.charAt(b) <='9') {
                check1 = true;
            } else{
                check1 = false;
                break;
            }
        }


            for (int c = lengthL; c > 0; ) {
                c--;
                if ((lower.charAt(c) >= '0') && (lower.charAt(c) <= '9')) {
                    check = true;

                } else {
                    check = false;
                    break;
                }
            }


        if(check && check1) {

        int UpperN = Integer.parseInt(upper);
        int LowerN = Integer.parseInt(lower);


    for (int i = LowerN; i <= UpperN; i++) {
        int sum = 0;
        double huh = 0;
        long huhwhat = 1;

        while (huhwhat <= i) {
            huh++;
            huhwhat *= 10;
        }
        double numbum = i;
        for (int h = (int) huh; h > 0; h--) {

            double numnum = numbum % 10;
            //System.out.println("numnum" + numnum);
            sum += (int) Math.pow(numnum, huh);
            // System.out.println("sum" + sum);
            numbum = Math.floor(numbum / 10);
            //System.out.println("numbum" + numbum);
        }

        if (sum == i) {
            System.out.println(sum);
        }

    }

} else{
    System.out.println("False input");
}
    }
}
