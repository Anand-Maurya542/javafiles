// handle an event in Swing Program
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EventDemo{
    JLabel jlab;
    EventDemo(){
        JFrame jfrm = new JFrame("An Event Example");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(220, 90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);

        //make two buttons
        JButton jbtnAlpha=new JButton("Alpha");
        JButton jbtnBeta=new JButton("Beta");

        //add action listener
        //use of anonymous inner classes
        jbtnAlpha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Alpha was pressed.");
            }
        });
        jbtnBeta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Beta was pressed.");
            }
        });


        jfrm.add(jbtnAlpha);
        jfrm.add(jbtnBeta);

        jlab = new JLabel("Press a button.");
        jfrm.add(jlab);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new EventDemo();
            }
        });
    }
}

