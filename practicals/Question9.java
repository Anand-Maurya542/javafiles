import java.awt.*;
import java.awt.event.*;

public class Question9 extends Frame{
    Label l;
    Question9(){
        super("AWT Pink");
        l=new Label("This is a Label.");
        l.setBounds(25,60,250,30);
        l.setAlignment(Label.CENTER);
        this.add(l);
        this.setSize(300,100);
        this.setLayout(null);
        this.setBackground(Color.pink);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Question9();
    }
}
