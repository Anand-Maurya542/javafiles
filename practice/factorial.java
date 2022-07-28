package college.practice;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int fact=1,num;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number that you want to calculate factorial : ");
        num=sc.nextInt();
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of number is : "+fact);
    }
}
