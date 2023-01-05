package com.company.HW5Q3;
//Saatvik Sandal 114378631
public class Circle2D {
    private double x,y;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2D() {
        this(0,0,1);
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    public boolean contains(double x, double y) {
        if((x>this.x - this.radius && x<this.x + this.radius) && (y>this.y - this.radius && y<this.y + this.radius))
            return true;

        return false;
    }

    //if c1 contains circle, meaning if circle is in c1.
    public boolean contains(Circle2D circle) {
        if(circle.x + circle.radius > this.x + this.radius)
            return false;
        if(circle.x - circle.radius < this.x - this.radius)
            return false;
        if(circle.y + circle.radius > this.y + this.radius)
            return false;
        if(circle.y - circle.radius < this.y - this.radius)
            return false;

        return true;
    }

    public boolean overlaps(Circle2D circle){
       double xdist = Math.pow(this.x-circle.x,2);
       double ydist = Math.pow(this.y-circle.y,2);
       double distance = Math.pow(xdist+ydist,0.5);


       if(this.radius + circle.radius >= distance) {
           return true;
       } else {
           return false;
       }
    }
}
