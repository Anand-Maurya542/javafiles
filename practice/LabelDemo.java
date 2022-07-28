package college.practice;
import javax.imageio.stream.ImageInputStream;
import java.awt.*;
import java.awt.event.*;
import java.nio.MappedByteBuffer;
//import java.applet.*;

public class LabelDemo extends Frame{
    public LabelDemo(){
        //use a flow layout
        setLayout(new FlowLayout());
        Label one = new Label("One");
        Label two =new Label("Two");
        Label three=new Label("Three");

        //add labels to frame
        add(one);
        add(two);
        add(three);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }

    public static void main(String[] args) {
        LabelDemo appwin=new LabelDemo();
        appwin.setSize(new Dimension(300,100));
        appwin.setTitle("LabelDemo");
        appwin.setVisible(true);
    }
}
