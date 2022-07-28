package college.practice;

import org.w3c.dom.html.HTMLOptGroupElement;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be Negative!!";
    }

    @Override
    public String getMessage() {
        return "I am getMessage";
    }
}

public class Throw_throws {
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        //made by anand
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        //sonu- uses divide function created by anand
        try {
//            int c = divide(6, 0);
//            System.out.println(c);
//        }catch(Exception e){
//            System.out.println("Exception");
//        }
            double ar = area(-2);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println("Exception");

        }
    }
}
