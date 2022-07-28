import java.util.*;

class Series{
    public static float  factorial(int a){
        float fact=1;
        for (int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("This program takes input for" +
                "number of terms and then print the sum of the following" +
                " series : - ");
        System.out.println("1 - 1/2! + 1/3! - 1/4! …….");
        System.out.println("And a method should be called for finding the factorial of a number.");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int t = sc.nextInt();
        float sump = 0;
        float sumn=0;
        float sum=0;
        for (int i = 1; i <= t; i++) {
            if (i%2==0){
                sumn+=1/factorial(i);
            }
            else{
                sump+=1/factorial(i);
            }
        }
        sum=sump-sumn;
        System.out.println("Sum is "+sum);
    }
}
