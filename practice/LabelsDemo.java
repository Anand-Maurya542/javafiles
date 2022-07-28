import java.awt.*;
import java.awt.event.*;

public class LabelsDemo extends Frame{
    public LabelsDemo(){
        //use a flow layout
        setLayout(new FlowLayout());
        Label one = new Label("One");
        Label two = new Label("Two");
        Label three = new Label("Three");
        three.setText("Anand ");

        //add labels to the frame.
        add(one);
        add(two);
        add(three);
        setVisible(true);
        setSize(300,100);
        setTitle("Labels Demo");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        LabelsDemo l=new LabelsDemo();
//        LabelsDemo l1=new LabelsDemo();
//        l.setVisible(true);

//        l.setSize(300,100);
//        l.setTitle("Labels Demo");
    }
}