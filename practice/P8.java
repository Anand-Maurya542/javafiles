//Write a program to create a frame using AWT. Implement mouseClicked( ),
//mouseEntered( ) and mouseExited( ) events. Frame should become visible when
//mouse enters it.
import java.awt.*;
import java.awt.event.*;

public class P8 extends Frame implements MouseListener{

    Label l;
    P8(String str){
        super(str);
        addMouseListener(this);

        this.addWindowListener(new WindowAdapter(){

            public void windowClosing(WindowEvent we){
                dispose();
            }

        });
        l=new Label();
        l.setBounds(20,50,100,20);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }
    @Override
    public void mousePressed(MouseEvent e) {


    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }


    public static void main(String[] args) {
        new P8("PRACTICAL 8: HANDLING MOUSE EVENTS");
    }
}