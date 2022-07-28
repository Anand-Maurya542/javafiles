package college.practice;

interface Callback{
    void callback(int param);
}

class Client implements Callback{
    //Implement Callback's Interface
    public void callback(int p){
        System.out.println("callback called with "+p);
    }
    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " +
                "may also define other members, too.");
    }
}
class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();      //Notice that variable c is declared to be of the
                                        // interface type Callback, yet it was assigned an
//                                          instance of Client
        c.callback(42);
    }
}

// Another implementation of Callback.
class AnotherClient implements Callback {
    // Implement Callback's interface
    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p*p));
    }
}

class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        c = ob; // c now refers to AnotherClient object
        c.callback(42);
    }
}