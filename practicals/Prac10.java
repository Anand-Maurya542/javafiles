import java.awt.*;
import java.awt.event.*;

public class Prac10 extends Frame implements ActionListener{
    Button btnRed, btnBlue;
    Prac10(){
        super("AWT Buttons");
        btnRed=new Button("Red");
        btnRed.setBounds(35,50,250,30);
        btnRed.addActionListener(this);
        this.add(btnRed);

        btnBlue=new Button("Blue");
        btnBlue.setBounds(35,100,250,30);
        btnBlue.addActionListener(this);
        this.add(btnBlue);

        this.setSize(300,160);
        this.setLayout(null);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }

    public static void main(String[] args) {
        new Prac10();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnBlue){
            this.setBackground(Color.BLUE);
        }
        else if(e.getSource()==btnRed){
            this.setBackground(Color.red);
        }
    }
}