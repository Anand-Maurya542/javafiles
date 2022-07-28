package college.assignment;



class VarargsExample1 {
     static void display(String ...values){
         System.out.println("Display method invoked.");
     }

    public static void main(String[] args) {
        display();  //zero argument
        display("my","name","is","varargs");    //four arguments
    }
}


//give the output of the following code
class A {
    public static void main(String[] args) {
        String a = "Test String";
        a = a.substring(5, 7);
        char b = a.charAt(1);
        a = a + b;
        System.out.println(a);
    }
}

class Inherit_Single{
    protected int s;
    Inherit_Single(){
        s=10;
    }
}
class SubClass extends Inherit_Single{
    SubClass(){
        s=11;
    }
    void display(){
        System.out.println(s);
    }
}
class MainClass{
    public static void main(String[] args) {
        SubClass obj=new SubClass();
        obj.display();
    }
}

class Test{
    public static void main(String[] args) {
        int [] x={1,2,3,4};
        int [] y=x;
        x=new int[2];
        for(int i=0;i<x.length;i++){
            System.out.print(y[i]+" ");
        }

    }
}