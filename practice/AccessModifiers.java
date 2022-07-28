package college.practice;



class c1{
    public int x=5;
    protected int y=45;
    int z=6;
    private int a=76;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

}
public class AccessModifiers {
    public static void main(String[] args) {
        c1 c=new c1();
//        c.meth1();
        System.out.println(c.z);
    }
}






