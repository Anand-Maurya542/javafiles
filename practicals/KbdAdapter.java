
//using AWT , write a program which responds to KEY_TYPED event and updates the
// status window with message ("Typed Character is : X"). Use Adapter class
//@author anandmaurya542@gmail.com  University of Delhi.......



import java.awt.*;
import java.awt.event.*;

//Demonstration of Adapter Class
/* **********Adapter classes are useful when you want to receive and process only
some of the events that are handled by a particular event listener interface.********** */
public class KbdAdapter extends KeyAdapter{
    Label l;
    String msg="";
    KbdAdapter(Label l){
        this.l=l;
    }

    /*Adapter classes supply empty implementations of a listener interface, enabling you to
override only the method or methods in which you are interested. */
    @Override
    public void keyTyped(KeyEvent e) {
        l.setText("Typed Character is : "+e.getKeyChar());
    }

//    @Override
//    public void keyPressed(KeyEvent e) {
//        System.out.println("Pressed character is "+e.getKeyChar());
//    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Released character is "+e.getKeyChar());
    }

}
class Main1 extends Frame{
    Label l;
    Main1(){
        super("AWT Keyboard");
        l=new Label("");
        l.setBounds(25,60,250,30);
        l.setAlignment(Label.CENTER);
        this.add(l);
        this.addKeyListener(new KbdAdapter(l));
        this.setSize(600,200);
        this.setLayout(null);

        //After a frame window has been created,
        // it will not be visible until you call setVisible( ).

        this.setVisible(true);

//        Clicking the close box, by itself,does not cause the
//        program to terminate. Therefore, it is necessary for
//        an AWT-based GUI program to handle a window-close event.

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // by clicking its close box—the program
                // must explicitly exit, often through a call to
                // System.exit( ).

                System.exit(0);
            }
        });
    }

        public static void main(String[] args) {
        new Main1();            //calling constructor in load main method
    }

}
