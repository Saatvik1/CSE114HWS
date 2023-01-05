package com.company.HW5Q1;
//Saatvik Sandal 114378631
public class Complex {
private double realPart;
private double imaginaryPart;


public Complex(double realPart, double imaginaryPart) {
    this.realPart = realPart;
    this.imaginaryPart = imaginaryPart;
}

public Complex() {
    this(1,1);
}

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public static Complex add(Complex obj1, Complex obj2) {
Complex addedObj = new Complex();
addedObj.imaginaryPart = obj1.imaginaryPart + obj2.imaginaryPart;
addedObj.realPart = obj1.realPart + obj2.realPart;

return addedObj;
}

public static Complex subtract(Complex obj1, Complex obj2) {
    Complex subtractedObj = new Complex();
    subtractedObj.imaginaryPart = obj1.imaginaryPart - obj2.imaginaryPart;
    subtractedObj.realPart = obj1.realPart - obj2.realPart;

return subtractedObj;
}

public static void print(Complex obj1) {
    System.out.println("(" + obj1.realPart + ", " + obj1.imaginaryPart + ")");
}
}
