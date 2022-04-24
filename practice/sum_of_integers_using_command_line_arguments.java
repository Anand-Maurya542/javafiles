package college.practice;
import java.io.*;
public class sum_of_integers_using_command_line_arguments {
    public static void main(String[] args) {
        int num,sum=0;
        System.out.println("Command line arguments are 10,20,30 ");
        for(int i=0;i<args.length;i++){
            num=Integer.parseInt(args[i]);
            sum=sum+num;
        }
        System.out.println("Sum of elements is : "+sum);

    }
}
