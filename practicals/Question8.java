import java.awt.*;
import java.awt.event.*;

public class Question8 extends Frame implements MouseListener {
    Label l;
    Question8(){
        super("AWT Frame");
        l=new Label();
        l.setBounds(25,60,250,30);
        l.setAlignment(Label.CENTER);
        this.add(l);
        this.setSize(300,300);
        this.setLayout(null);
        this.setVisible(true);
        this.addMouseListener(this);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Question8();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

}
