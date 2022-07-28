package college.practicals;




/* Design a class complex having a real part and an imaginary part.
Provide methods to perform the following operations on complex numbers :
a) Add two numbers.
b) Multiply two complex numbers.
c) toString() method to display complex numbers in the form of : x+iy.

@author anandmaurya542@gmail.com University of Delhi.........
 */

public class complex {
    private int x;
    private int y;

    //    Parameterized constructor of complex class
    public complex(int real,int imaginary){
        this.x=real;
        this.y=imaginary;
    }

    //    Add two complex objects
    public complex add(complex o){
        return new complex(
                this.x+o.x,
                this.y+o.y
        );
    }
    //    Multiply two complex objcts
    public complex multiply(complex o){
        return new complex(
                this.x*o.x-this.y*o.y,
                this.x*o.y+o.x*this.y
        );
    }
    //    type conversion to string
    public String toString(){
        return x+"+ i "+y;
    }

    public static void main(String[] args) {
        complex c1=new complex(1,2);
        complex c2=new complex(3,4);
        System.out.println("Complex 1: "+c1);
        System.out.println("Complex 2: "+c2);
        System.out.println("Sum : "+c1.add(c2));
        System.out.println("Product : "+c1.multiply(c2));
    }


}


