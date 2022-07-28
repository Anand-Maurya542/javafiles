//use  an array to pass variable number of arguments to a method. This is a old style approach
//to  variable length arguments.

class PassArray{
    static void vatest(int [] v){
        System.out.print("Number of arguments : "+v.length+" contents: ");
        for(int x:v)
            System.out.print(x+" ");
        System.out.println();

    }

    public static void main(String[] args) {
        //notice how an array must be created to hold the arguments.
        int[] n1 = { 10 };
        int[] n2 = { 1, 2, 3 };
        int[] n3 = { };
        vatest(n1);     //1 args
        vatest(n2);     //3 args
        vatest(n3);     //no args
    }
}



// Demonstrate variable-length arguments.
class VarArgs {
    // vaTest() now uses a vararg.
    static void vaTest(int ... v) {
        System.out.print("Number of args: " + v.length +
                " Contents: ");
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        // Notice how vaTest() can be called with a
        // variable number of arguments.
        vaTest(10); // 1 arg
        vaTest(1, 2, 3); // 3 args
        vaTest(); // no args
    }
}