package com.company.HW5Q2;
//Saatvik Sandal 114378631


public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        int lesserVal = Math.min(numerator, denominator);
        int greatestDiv = 0;

        for(int i = 2; i<=lesserVal; i++) {
           if((numerator%i == 0)  && ((denominator%i) == 0)) {
               greatestDiv = i;
           }

        }
        if(greatestDiv!=0) {
            this.numerator = numerator/greatestDiv;
            this.denominator = denominator/greatestDiv;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }

    }

    public Rational() {
        this(2,4);
    }

    public static Rational addition(Rational obj1, Rational obj2) {
        int LCM = obj1.denominator * obj2.denominator;
        obj1.numerator = obj1.numerator * (LCM/obj1.denominator);
        obj2.numerator = obj2.numerator * (LCM/obj2.denominator);
        obj1.denominator = LCM;
        obj2.denominator = LCM;


        return new Rational(obj1.numerator + obj2.numerator, obj2.denominator);
    }

    public static Rational subtraction(Rational obj1, Rational obj2) {
        int LCM = obj1.denominator * obj2.denominator;
        obj1.numerator = obj1.numerator * (LCM/obj1.denominator);
        obj2.numerator = obj2.numerator * (LCM/obj2.denominator);
        obj1.denominator = LCM;
        obj2.denominator = LCM;


        return new Rational(obj1.numerator - obj2.numerator, obj2.denominator);
    }
@Override
    public String toString(){
        return this.numerator + "/" + this.denominator;
}

public static Rational multiplication(Rational obj1, Rational obj2){
        return new Rational(obj1.numerator * obj2.numerator, obj1.denominator*obj2.denominator);
}

public static Rational division(Rational obj1, Rational obj2){
        return new Rational(obj1.numerator * obj2.denominator, obj1.denominator * obj2.numerator);
}
}
