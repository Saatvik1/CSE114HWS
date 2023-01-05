package com.company.HW5Q3;
//Saatvik Sandal 114378631
public class CircleCompare {

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);

        System.out.println("Area of circle 1 is: " + c1.getArea() + "\n" +
                "Perimeter of circle 1 is: " + c1.getPerimeter());
        System.out.println("c1 contains point (3,3): " + c1.contains(3,3));
        System.out.println("c1 contains circle "+ c1.contains(new Circle2D(4,5,10.5)));
        System.out.println("c1 overlaps circle " + c1.overlaps(new Circle2D(3,5,2.3)));

    }
}
