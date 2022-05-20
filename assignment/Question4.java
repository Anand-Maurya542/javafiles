/*This program will ask the user to enter his/her password which is of
type String. This password is matched with two passwords say password1 and password2
(already available in the program and both of type String). The program segment should continue
asking the user to enter his/her password until the user correctly enters it. If the password matches
, then the program segment should print "Welcome User.." */

import java.util.*;
class Password{
    String passwd1="Anand";
    String passwd2="Anand Maurya";
//    String passwd=new String();

}
class TestPasswd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag=0;
        Password a = new Password();
        do{
            System.out.println("Enter password : ");
            String passwd = sc.nextLine();
        if ((a.passwd1).equals(passwd) ||(a.passwd2).equals(passwd)) {
            System.out.println("Password enterd correctly.....");
            System.out.println("Welcome User...");
            flag=1;
        }
        else {
            System.out.println("Wrong Password !! Enter again... ");

        }
    }while(flag!=1);
    }
}