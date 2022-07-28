import p1.Shape;
import p2.Rectangle;
import p3.Circle;

import java.util.Scanner;

class Main12{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Rectangle R1=new Rectangle(5,4);
        Circle C1=new Circle(5);
        Shape ref=null;
        System.out.println("Enter the type of Shape (1.Rectangle 2. Circle ) : ");
        int num=scan.nextInt();
        if (num==1){
            ref=R1;
        }
        else if (num==2){
            ref=C1;
        }
        else
            System.out.println("Invalid Input");
        assert ref!=null;
        ref.area();

    }
}
