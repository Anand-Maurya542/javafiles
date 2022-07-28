/*
class circle{
    public int radius;
    circle(){
        System.out.println("I am default constructor");
    }
    circle(int r){
        System.out.println("I am circle parameterised constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder extends circle{
    public int height;
    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
    cylinder(int r,int h){

        super(r);
        System.out.println("I am cylinder's parametrised constructor");
        this.height=h;
    }
}
class Testcircle{
    public static void main(String[] args) {
        cylinder ob=new cylinder(6,4);
//        circle obc=new circle(12);
    }
}*/


interface TEst{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);

    //Because getString( ) includes a default implementation, it is not necessary for an
    //implementing class to override it. In other words, if an implementing class does not provide
    //its own implementation, the default is used.
    default String getString(){
        return "Greetings for your new Bicycle...";
    }
}

class AvonCycle implements TEst{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speed Up");
    }
}
class Bicycle{
    public static void main(String[] args) {
        AvonCycle atlas=new AvonCycle();
        String greet=atlas.getString();
        System.out.println(greet);
        atlas.applyBrake(1);

    }
}


