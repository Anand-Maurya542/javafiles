import java.util.*;
class fibonacci_series{
    void series(int n,int first,int second){
        System.out.print(first+" ");
        if (n==1){
            return;
        }
        series(n-1,second,(first+second));
    }

    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of terms you want to see in your fibonacci series");
        n=s.nextInt();
        fibonacci_series show=new fibonacci_series();
        show.series(n,0,1);
        System.exit(0);
    }
}