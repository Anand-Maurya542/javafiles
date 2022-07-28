//package college.practice;
//
//public class ExceptionalHandling {
////    public static void main(String[] args) {
//       static void subroutine() {
//            int d = 0;
//            int a = 5;
//            System.out.println(a / d);
//    }
//
//    public static void main(String[] args) {
//        ExceptionalHandling.subroutine();
//    }
//}

//class Exc2 {
//    public static void main(String[] args) {
//        int d, a;
//        try { // monitor a block of code.
//            System.out.println("This will not be printed.");
//
//            d = 0;
//            a = 42 / d;
//              } catch (ArithmeticException e) { // catch divide-by-zero error
//            System.out.println("Division by zero.");
//        }
//        System.out.println("After catch statement.")

// Handle an exception and move on.
//i
//class Maingg {
//    static  int x, y;
//
//    static void test() {
//        x = 10;
//        System.out.println(x);
//    }
//
//}
//class test{
//    public static void main(String args[]) {
//        test();
//
//    }
//}


// Using abstract methods and classes.
abstract class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    // area is now an abstract method
    abstract double area();
}
class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }
    // override area for rectangle
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }
    // override area for right triangle
    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
class AbstractAreas {
    public static void main(String[] args) {
        // Figure f = new Figure(10, 10); // illegal now
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref; // this is OK, no object is created
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
    }
}
