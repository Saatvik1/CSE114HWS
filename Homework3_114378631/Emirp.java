package com.company.Homework3P1;


public class Emirp {

    public static void main(String[] args) {
        int numPrinted = 0;
        int emirp = 0;

        for(int i = 1; emirp<= 100; i++) {

           if(primeCheck(i)) {
               if(!palindromeCheck(i)) {
                   System.out.print(i + " ");
                   numPrinted++;
                   emirp++;
               }

           }
            if(numPrinted % 10 == 0 && numPrinted>=10){
                System.out.println();
                numPrinted = 0;
            }
        }

    }

    public static boolean primeCheck(int a) {
        boolean primeCheckVar = true;
        for(int k = 1; k< a; k++) {
            if(a%k == 0 && k != 1) {
                    primeCheckVar = false;
                    return primeCheckVar;
            }
        }
        return primeCheckVar;
    }

    public static boolean palindromeCheck(int b) {
        boolean palindromeCheckVar = true;
        String value = "" + b;
        int kPlace = 0;
        String reverse = "";

        for(int i = value.length(); i>0; i--) {
            reverse += value.charAt(i-1);
        }
        //System.out.println(reverse);

        if(primeCheck(Integer.parseInt(reverse))) {
            for (int i = value.length(); i > 0; i--) {
                if (value.charAt(i - 1) != value.charAt(kPlace)) {
                    palindromeCheckVar = false;
                    return palindromeCheckVar;
                }
                kPlace++;
            }
        } else {

            palindromeCheckVar = true;
            return palindromeCheckVar;
        }

        return palindromeCheckVar;


    }



}
