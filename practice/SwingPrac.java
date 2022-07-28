// A simple Swing Program
import javax.swing.*;

class SwingDemo{
    SwingDemo(){
        //create a new JFrame Container
        JFrame jfrm=new JFrame("A Simple Swing Application");
        jfrm.setSize(275,100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab=new JLabel("Swing means powerful GUI's");
        jfrm.add(jlab);
        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        //create the frame on the event dispatching thread
        SwingUtilities.invokeLater( new Runnable(){
            public void run(){
                new SwingDemo();
            }
        });
    }
}