import java.util.*;
class Matrix{
    int rows,cols;
    int [][] a;

    Scanner s=new Scanner(System.in);
    Matrix(int r,int c){
        this.rows=r;
        this.cols=c;
        a=new int[r][c];
    }
    void input_matrix(){
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
               a[i][j]=s.nextInt();
            }
        }
    }
    void read_Matrix(){
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

// Matrix Multiplication

    void multiply(Matrix B){
        if (cols!=B.rows){
            System.out.println("Multiplication not possible because " +
                    "columns of first matrix is not equal to rows of second matrix..");
        }
        else{
            int result[][]=new int [rows][B.cols];
            System.out.println("Multiplication of two given matrices is : ");
            for (int i=0;i<rows;i++){
                for (int j=0;j<B.cols;j++){
                    result[i][j]=0;
                    for (int k=0;k<B.rows;k++){
                       result[i][j]+=a[i][k]*B.a[k][j];
                    }
                    System.out.print(result[i][j]+"  ");
                }
                System.out.println();
            }
        }
    }
}

class TestCase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows for first array :");
        int r=sc.nextInt();
        System.out.println("Enter number of columns for first array :");
        int c=sc.nextInt();
        Matrix arr=new Matrix(r,c);

        System.out.println("Enter elements for first array :");
        arr.input_matrix();
        System.out.println("First array : ");
        arr.read_Matrix();
        System.out.println("Enter number of rows for second array : ");
        int r1= sc.nextInt();
        System.out.println("Enter number of columns for second array : ");
        int c1=sc.nextInt();
        Matrix arr2=new Matrix(r1,c1);
        System.out.println("Enter elements for second array : ");
        arr2.input_matrix();
        System.out.println("Second array : ");
        arr2.read_Matrix();

        arr.multiply(arr2);
    }
}