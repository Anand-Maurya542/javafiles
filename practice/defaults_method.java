package college.practice;

interface MyCamera{
   void  takeSnap();
   void recordVideo();
   default void record4KVideo(){
       System.out.println("Recording video in 4K....");
   }
}
interface MyWiFi{
    String[] getNetwork();
    void connectToNetworks(String networks);
}
class MyCellPhone{
    void callNumber(int phonenumber){
        System.out.println("Caling "+phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting........");
    }

}
class MySmartPhone extends MyCellPhone implements MyWiFi,MyCamera{
   public void takeSnap(){
        System.out.println("Taking snap !!!");
    }
    public void recordVideo(){
        System.out.println("Recording video....");
    }
    public String[] getNetwork(){
        System.out.println("Getting list of networks....");
        String[] networkList={"Anand","Aman","Dhruv"};
        return networkList;
    }
    public void connectToNetworks(String network){
        System.out.println("Connecting to "+network);
    }

}

public class defaults_method {
    public static void main(String[] args) {
        MySmartPhone ms=new MySmartPhone();
        String[] ar = ms.getNetwork();
        for (String item: ar) {
            System.out.println(item);
        }
        ms.recordVideo();
        ms.record4KVideo();

    }
}
