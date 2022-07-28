//// This class defines an integer stack that can hold 10 values
//class Stack{
//    int [] stck=new int[10];
//    int tos;
//
//    // Initialize top-of-stack
//    Stack(){
//        tos=-1;
//    }
////    push an item onto the stack
//    void push(int item){
//        if(tos==9){
//            System.out.println("Stack is full.");
//        }
//        else
//            stck[++tos]=item;
//    }
//
////    pop an item from the stack
//    int pop(){
//        if (tos<0){
//            System.out.println("Stack underflow.");
//            return 0;
//        }
//        else
//            return stck[tos--];
//    }
//}
//class TestStack{
//    public static void main(String[] args) {
//        Stack mystack1=new Stack();
//        Stack mystack2=new Stack();
//
//        //push some members onto the stack
//        for (int i=0;i<10;i++) mystack1.push(i);
//        for (int i=10;i<20;i++) mystack2.push(i);
//        System.out.println("Adding item done.....");
//
//        //pop those numbers of the stack
//        System.out.println("Stack in mystack1 : ");
//        for(int i=0; i<10; i++)
//            System.out.println(mystack1.pop());
//        System.out.println("Stack in mystack2:");
//        for(int i=0; i<10; i++)
//            System.out.println(mystack2.pop());
//
//
//
//    }
//}


// Improved Stack class that uses the length array member.
class Stack{
    private int [] stck;
    private int tos;

    //allocate and initialize stack
    Stack(int size){
        stck=new int[size];
        tos=-1;
    }
    //push an item onto the stack
    void push(int item){
        if(tos==stck.length-1)  //use length number
            System.out.println("Stack is full");
        else
            stck[++tos]=item;

    }
//    pop an item from the stack
    int pop(){
        if(tos<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stck[tos--];
    }


}

class TestStack2{
    public static void main(String[] args) {
        Stack mystack1=new Stack(5);
        Stack mystack2=new Stack(8);

        //push some members onto the stack
        for(int i=0;i<5;i++)    mystack1.push(i);
        for(int j=0;j<8;j++)    mystack2.push(j);

        //pop those members of the stack
        System.out.println("Stack in mystack1:");
        for(int i=0; i<5; i++)
            System.out.println(mystack1.pop());
        System.out.println("Stack in mystack2:");
        for(int i=0; i<8; i++)
            System.out.println(mystack2.pop());
    }
}