//WAP to handle Mouse Events in both child and applet window.


import java.awt.*;
import java.awt.event.*;
public class Question10 extends Frame
        implements MouseListener,MouseMotionListener{
    String msg="";
    int mouseX=0,mouseY=0; //coordinates of mouse

    public  Question10() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    //handled mouse clicked
    public void mouseClicked(MouseEvent me){
        msg=msg+"----click received ";
        repaint();
    }

    //handle mouse entered
    public void mouseEntered(MouseEvent me){
        mouseX=100;
        mouseY=100;
        msg="Mouse Entered";
        repaint();
    }
    //handle mouse exit
    public void mouseExited(MouseEvent me){
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse exited.";
        repaint();

    }

    //handle button pressed
    public void mousePressed(MouseEvent me) {
        // save coordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Button down";
        repaint();
    }
    // Handle button released.
    public void mouseReleased(MouseEvent me) {
        // save coordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Button Released";
        repaint();
    }
    // Handle mouse dragged.
    public void mouseDragged(MouseEvent me) {
        // save coordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*" + " mouse at " + mouseX + ", " + mouseY;
        repaint();
    }
    // Handle mouse moved.
    public void mouseMoved(MouseEvent me) {
        msg = "Moving mouse at " + me.getX() + ", " + me.getY();
        repaint();
    }
    // Display msg in the window at current X,Y location.
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }
    public static void main(String[] args) {
        Question10 appwin = new Question10();
        appwin.setSize(new Dimension(300, 300));
        appwin.setTitle("MouseEventsDemo");
        appwin.setVisible(true);
    }
}






