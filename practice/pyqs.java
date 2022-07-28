package college.practice;

//class A{
//    public static void main(String[] args) {
//        int i1=5;
//        int i2=7;
//        String s="Anand";
//        System.out.println(i1+i2);
//        System.out.println(i1+i2+s);
//        System.out.println(s+i1+i2);
//        System.out.println(i1+s+i2);
//    }
//}

//class A{
//    public static void main(String[] args) {
//        String a="newspaper";
//        a=a.substring(5,7);
//        char b=a.charAt(1);
//        a=a+b;
//        System.out.println(a);
//    }
//}

//class Inherit_Single{
//    protected int s;
//    Inherit_Single(){
//        s=10;
//    }
//}
//class Subclass extends Inherit_Single{
//    Subclass(){
//        s=11;
//    }
//    void display(){
//        System.out.println(s);
//    }
//}
//class MainClass{
//    public static void main(String[] args) {
//        Subclass obj=new Subclass();
//        obj.display();
//    }
//}

class A{
    public static void main(String[] args) {
        Outer: for(int i=0;i<5;i++)
            for (int j=0;j<5;j++){
                if (j>1){
                    System.out.println();
                    continue Outer;
                }
                System.out.println(""+(i+j));
            }
        System.out.println();
    }
}

