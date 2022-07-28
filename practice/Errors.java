//package college.practice;
//
//import java.util.Scanner;
//
//public class Errors {
//    public static void main(String[] args) {
////        int a=6000;
////        int b=6;
////        try {
////            float c = a / b;
////            System.out.println("The result is "+c);
////        }
////        catch (Exception e){
////            System.out.print("We failed to divide. \nReason: ");
////            System.out.println(e);
////        }
////        System.out.println("End of the program.");
//
//        int[] marks = new int[5];
//        marks[0] = 7;
//        marks[1] = 56;
//        marks[2] = 6;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array index: ");
//        int ind = sc.nextInt();
//        System.out.println("Enter the number you want to divide the value with ");
//        int number = sc.nextInt();
//        try {
//            System.out.println("The value at array index entered is : " + marks[ind]);
//            System.out.println("The value of array-value/number is " + marks[ind] / number);
//
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException occured.");
//            System.out.println(e);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBondExceptionOccured .");
//            System.out.println(e);
//
//        } catch (Exception e) {
//            System.out.println("Some other exception occured.");
//            System.out.println(e);
//        }
//    }
//}

import java.util.Scanner;

class Errors{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] marks = new int[5];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        boolean flag=true;
        System.out.println("Enter the value of index :");
        int ind=sc.nextInt();
        while(flag){
            try{
                System.out.println("Welcome to video number 82");
                try {
                    System.out.println(marks[ind]);
                    flag=false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            }
            catch (Exception e){
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program");
    }
}
