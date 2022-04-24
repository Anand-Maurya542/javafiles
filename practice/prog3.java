//to learn use of single dimensional array by defining the array is dynamically.

package college.practice;
import java.util.Scanner;
public class prog3 {
    public static void main(String[] args) {


        int a[] = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int s = scan.nextInt();
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < s; i++) {
            a[i] = scan.nextInt();
        }
        for (int x = 0; x < s; x++) {
            a[x] = a[x] + 5;
        }
        System.out.print("After adding 5 in each element:");
        for (int j = 0; j < s; j++) {
            System.out.print(a[j] + " ");
        }
    }
}