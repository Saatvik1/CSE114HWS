package com.company.HW4Q4;
import java.util.Scanner;

// Saatvik Sandal 114378631

public class MultiplyMatrix {

    public static void main(String[] args) {

        System.out.println("Enter a 3x3 array: ");
        Scanner input = new Scanner(System.in);
        double[][] userMatrix1 = new double[3][3];
        double[][] userMatrix2 = new double[3][3];

        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                userMatrix1[i][j] = input.nextDouble();
            }
        }

        System.out.println("Enter the second 3x3 array: ");
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                userMatrix2[i][j] = input.nextDouble();
            }
        }
        double [][] productValCopy = new double[3][3];

        System.arraycopy(product(userMatrix1,userMatrix2),0,productValCopy,0,3);

        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                System.out.printf( "%.1f " ,productValCopy[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] product(double[][] userMatrix1, double[][] userMatrix2) {
        double[][] prodcutVal = new double[3][3];

        for(int i = 0; i<prodcutVal.length; i++) {
            for(int j = 0; j<prodcutVal[i].length; j++) {
                prodcutVal[i][j] = (userMatrix1[i][0] * userMatrix2[0][j]) +
                        (userMatrix1[i][1] * userMatrix2[1][j]) + (userMatrix1[i][2] * userMatrix2[2][j]);
            }
        }

        return prodcutVal;
    }

}
