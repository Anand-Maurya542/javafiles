package college.practice;

import java.util.Scanner;

public class practice_set14 {
    public static void main(String[] args) {
        //problem2
        try{
            int a=666/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("hehe");
        }
        catch(ArithmeticException e){
            System.out.println("haha");
        }

        //problem 3
        int i=0;
        boolean flag=true;
            int [] marks=new int [10];
            marks[0]=12;
            marks[1]=54;
            marks[2]=65;
            Scanner sc =new Scanner(System.in);
            int index;

            while(flag && i<5){
                try {
                    System.out.println("Enter Index");
                    index = sc.nextInt();
                    System.out.println("The value of marks[index] is" + marks[index]);
                    break;
                }
                catch(Exception e){
                    System.out.println("Invalid Index");
                    System.out.println("Error");
                    i++;

                }
            }

    }
}
