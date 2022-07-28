//@author anandmaurya542@gmail.com  University of Delhi....
import java.util.*;
class Student{
    String name;
    int total_quiz_score;
    int number_of_quizzes_took;
    Scanner sc=new Scanner(System.in);

    //constructor
    Student(String name,int total_quiz_score,int number_of_quizzes_took){
        this.name=name;
        this.total_quiz_score=total_quiz_score;
        this.number_of_quizzes_took=number_of_quizzes_took;
    }
    public String getName(){

        System.out.println("Enter your name");
        name=sc.nextLine();
        return name;
    }
    public int getTotalScore(){
        System.out.println("Enter number of quizzes took place : ");
        number_of_quizzes_took=sc.nextInt();
        total_quiz_score=0;
        System.out.println("Enter scores : ");
        for (int i=0;i<number_of_quizzes_took;i++){
            int a=sc.nextInt();
            total_quiz_score+=a;
        }
        return (total_quiz_score);
    }
    public double calAvgScore(){
        System.out.println("Average is : "+total_quiz_score/number_of_quizzes_took);

        return (total_quiz_score/number_of_quizzes_took);
    }

    public static void main(String[] args) {
        Student s1=new Student("",0,0);
        s1.getName();
        s1.getTotalScore();
        s1.calAvgScore();
    }
}