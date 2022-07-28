package p2;
import p1.Shape;

public class Rectangle extends Shape {
    double length;
    double breadth;
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void area(){
        System.out.println("The area of rectangle is "+length*breadth);

    }
    public void greet(){
        System.out.println("Good Morning Baccha");
    }



}
