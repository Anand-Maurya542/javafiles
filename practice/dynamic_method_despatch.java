class Phone{
    public void on(){
        System.out.println("Turning on phone.");
    }
    public void greet(){
        System.out.println("Good morning");
    }
}
class SmartPhone extends Phone{
    public void on(){
        System.out.println("Turning on  smartphone.");
    }
    public void swagat(){
        System.out.println("Aapka swagaat hai.");
    }
}
class main_method{
    public static void main(String[] args) {
        //Phone obj=new Phone();        allowed   //run time pe banega
        SmartPhone smobj=new SmartPhone();         //allowed
//        smobj.name();
        Phone obj=new SmartPhone();     //yes it is allowed....
                                    //Dynamic Method Dispatch
        obj.greet();
//        run time polymorphism
        obj.on();               //object ka method run hoga na ki reference ka

    }
}
