////demonstrate an inner class
//class Outer{
//    int outer_x=100;
//    void test(){
//        Inner inner=new Inner();
//        inner.display();
//    }
//
//    //this is an inner class
//    class Inner{
//        void display(){
//            System.out.println("Display: outer_x= "+outer_x);
//        }
//    }
//}
//class InnerClassDemo{
//    public static void main(String[] args) {
//        Outer outer=new Outer();
//        outer.test();
//    }
//}


//command line arguments
class CommandLine{
    public static void main(String[] args) {
        for (int i=0;i<args.length;i++){
            System.out.println("args[" + i + "]: " +
                    args[i]);
        }
    }
}