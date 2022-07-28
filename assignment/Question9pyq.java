// Write a program to display "Hello World " in blue color.

import java.awt.*;
import java.awt.event.*;
public class Question9pyq extends Frame{
    Label msg;
    public Question9pyq(){
        msg=new Label("Hello World");
        setVisible(true);
        add(msg);
        setLayout(new FlowLayout());
        setSize(2150,450);
        setTitle("Question 9 PYQ");
        msg.setForeground(Color.blue);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Question9pyq();
    }

}
