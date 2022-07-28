package college.practice;

import java.util.Scanner;

public class MyException extends Exception {
    public String toString(){
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am get message";
    }

    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a=sc.nextInt();
        if (a<99){
            try {
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");

            }
        }

    }
}
