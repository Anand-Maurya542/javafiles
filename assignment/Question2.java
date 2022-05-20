///* A loop asks the users to enter first name of the person and his/her
//height. If the name has more than 10 characters, then it should exit from the
//loop. If the height is more than 10 feet it should exit from the loop. If both inputs
//are OK, then it should convert the height in feet to inches and print the name and
//height of the person...
//
//@author anandmaurya542@gmail.com        University of Delhi */
//import java.util.*;
//import java.util.*;
//class Person {
//        Scanner sc = new Scanner(System.in);
//        String name;
//        float height;
//        boolean flag = true;
//        void takeInput(){
//            System.out.print("Enter name : ");
//            name = sc.nextLine();
//            System.out.println("Enter height(in feet)");
//            height = sc.nextFloat();
//
//        }
//        void getNameHeight(){
//            while (flag == true) {
////            System.out.print("Enter name : ");
////            name=sc.nextLine();
////            System.out.println("Enter height(in feet)");
////            height=sc.nextFloat();
//                takeInput();
//                if (((name.length()) < 10) && height < 6) {
//                    display();
//                    System.out.println("Height in inches : " + conversion(height));
//
//                } else {
//                    System.out.println("Name should be of less than 10" +
//                            " characters or Height should be less than 6 feet");
//                    flag = false;
//                    break;
//                }
//            }
//        }
//        void display(){
//            System.out.println("Name : " + name);
//            System.out.println("Height : " + height);
//        }
//        float conversion( float height){
//            return height * 12;
//        }
//    }
//class Test2{
//    public static void main(String[] args) {
//
//    }
//}