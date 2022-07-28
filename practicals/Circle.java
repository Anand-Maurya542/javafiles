package p3;
import p1.Shape;

public class Circle extends Shape
{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public void area(){
        System.out.println("The area of circle is "+Math.PI*radius*radius);
    }
}
