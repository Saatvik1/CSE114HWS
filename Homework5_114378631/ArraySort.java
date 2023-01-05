package com.company.HW5Q4;
//Saatvik Sandal 114378631
import java.util.Scanner;

public class ArraySort {

    public static void main(String[] args) {
        System.out.println("Enter a 3x3 matrix: ");
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];

        for(int i =0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        print(sortRows(matrix));

    }

    public static double[][] sortRows(double[][] m) {
        for(int i = 0; i<m.length; i++) {
            for(int j = 0; j<m[i].length; j++) {
                for(int k = 0; k<m[i].length-1;k++) {
                    if(m[i][k] > m[i][k+1]) {
                        double temp = m[i][k];
                        m[i][k] = m[i][k+1];
                        m[i][k+1] = temp;
                    }
                }
            }
        }
        return m;
    }

    public static void print(double[][] m ){
        for(int i =0; i<m.length; i++){
            for(int j = 0; j<m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
