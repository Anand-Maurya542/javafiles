package college.practicals;

public class Stack {
    //top of Stack
    private int tos;

    //Array of elements;
    private int[] array;

    //size of the stack
    final private int size;

    /* Public constructor for stack objects
     */
    public Stack(int size){
        this.tos=-1;
        this.size=size;
        this.array=new int[this.size];
    }

    //push an element at top of the stack
    public void push(int e) throws StackException{
        if (tos==size-1)
            throw new StackException("Stack OverFlow: could not push "+e);
        else
            this.array[++this.tos]=e;
    }

    //pop an element from the stack
    public int pop() throws StackException {
        if (this.tos < 0)
            throw new StackException("Stack Underflow: could not pop ");
        else
            return this.array[this.tos--];
    }
    //Index of the element at the top of the stack
    public int getTOS(){
        return this.tos;
    }

    //representation of stack object
    public String toString(){
        return "Stack<size= "+this.size+">";
    }

}


