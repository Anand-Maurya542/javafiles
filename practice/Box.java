package college.practice;
/*A program that uses a Box class.
*   Calls this file BoxDemo.java */

class Box {
    double width;
    double height;
    double depth;

    /* Here, Box uses a constructor to initialize the
 dimensions of a box
     */
    // This is the default constructor for Box.
    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

//    Box allows one object to initialize another
// Notice this constructor. It takes an object of type Box
    Box(Box ob){
        //pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
//
//    this is parameterised constructor of class Box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
}




//    display volume of the box.
//    void volume(){
//        System.out.print("Volume is : ");
//        System.out.println(width*height*depth);


    //    what if another part of your program wanted to know the volume of a box, but not display its value
//    Now, volume() returns the volume of a box
//
//    compute and return volume
    double volume() {
        return width * height * depth;
    }


    //  set dimensions of the box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
//this class declares an object of type Box.
//class BoxDemo{
//    public static void main(String[] args) {
//        Box mybox=new Box();
//        double vol;
//
////        assign values to mybox's instance variables
//        double w=mybox.width=10;
//        double h=mybox.height=20;
//        double d=mybox.depth=15;
//
////        compute volume of box.
//        vol=w*h*d;
//        System.out.println("Volume is "+vol);
//
//    }
//}


//class BoxDemo2{
//    public static void main(String[] args) {
//        Box mybox1=new Box();
//        Box mybox2=new Box();
//        double vol;
//
//        double a1=mybox1.depth=2;
//        double b1=mybox1.height=3;
//        double c1=mybox1.width=4;
//
////        vol=a1*b1*c1;
////        System.out.println("Volume of First Box is "+vol);
//
//        double a2= mybox2.depth=5;
//        double b2=mybox2.height=6;
//        double c2=mybox2.width=7;
////        vol=a2*b2*c2;
////        System.out.println("Volume of second box is "+vol);
////
////        display volume of first box
////        mybox1.volume();
////        mybox2.volume();
//
//        // get volume of first box
//        vol = mybox1.volume();
//        System.out.println("Volume is " + vol);
//        // get volume of second box
//        vol = mybox2.volume();
//        System.out.println("Volume is " + vol);
//
//    }
//}


class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        // initialize each box
//        mybox1.setDim(10, 20, 15);
//        mybox2.setDim(3, 6, 9);
        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}

class BoxDemo7 {
    public static void main(String[] args) {
        // declare, allocate, and initialize Box objects
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
class OverloadCons2 {
    public static void main(String[] args) {
        // create boxes using the various constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
//        Box mycube = new Box(7);
        Box myclone = new Box(mybox1); // create copy of mybox1
        double vol;
        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
//        // get volume of cube
//        vol = mycube.volume();
//        System.out.println("Volume of cube is " + vol);
        // get volume of clone
        vol = myclone.volume();
        System.out.println("Volume of clone is " + vol);
    }
}