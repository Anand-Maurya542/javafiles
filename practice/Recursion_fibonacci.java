import java.util.*;
class Recursion{
    static int n1=0,n2=1,n3=0;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        printFibonacci(e);
    }
    static  void printFibonacci(int e){
        System.out.print("Fibonacci series : 0 1 ");
        fibonacci(e-2);
    }
    static void fibonacci(int e){
        if (e>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
            fibonacci(e-1);
        }
    }
}