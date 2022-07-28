package college.practice;

////demonstrate method overloading
//
//class OverloadDemo{
//    void test(){
//        System.out.println("No parameters");
//    }
////    overload test for one integer parameter
//    void test(int a){
//        System.out.println("a: "+a);
//    }
//    // Overload test for two integer parameters.
//    void test(int a, int b) {
//        System.out.println("a and b: " + a + " " + b);
//    }
//    // Overload test for a double parameter
//    double test(double a) {
//        System.out.println("double a: " + a);
//        return a*a;
//    }
//
//}
//class overload{
//    public static void main(String[] args) {
//        OverloadDemo ob=new OverloadDemo();
//        double result;
//        // call all versions of test()
//        ob.test();
//        ob.test(10);
//        ob.test(10, 20);
//        result = ob.test(123.25);
//        System.out.println("Result of ob.test(123.25): " + result);
//    }
//
//}









//Using methods as parameters

//objects may be passed to methods
class Test{
    int a,b;
    Test(int i, int j){
        a=i;
        b=j;
    }
    // return true if o is equal to the invoking object
    boolean equalTo(Test o){
        if(o.a==a &&o.b==b)
            return true;
        else
            return false;
    }

}

class PassOb{
    public static void main(String[] args) {
        Test ob1=new Test(100,22);
        Test ob2=new Test(100,22);
        Test ob3=new Test(-1,-1);
        System.out.println("ob1==ob2: "+ob2.equalTo(ob1));
        System.out.println("ob1==ob3: "+ob3.equalTo(ob1));

    }
}