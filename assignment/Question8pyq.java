/*
 Create two push buttons "No" and "Yes" on Frame window and write
 a program to display the label of the button when label is pressed.
*/

import java.awt.*;
 import java.awt.event.*;

 class Question8pyq extends Frame implements ActionListener{
     Button yes,no;
     String str="";
     public  Question8pyq(){

         setLayout(new FlowLayout());
         yes=new Button("Yes");
         no=new Button("No");
         setVisible(true);
         setTitle("PYQ");
         setSize(new Dimension(250,250));

         add(yes);
         add(no);
         yes.addActionListener(this);
         no.addActionListener(this);

         addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 System.exit(0);
             }
         });
     }
     public void actionPerformed(ActionEvent ae){
         String msg=ae.getActionCommand();
         if (msg.equals("Yes")){
             str="You pressed YES Butoon ";
         }
         else {
             str = "You pressed No Button";
         }
         repaint();
     }
     public void paint(Graphics g){
         g.drawString(str,20,100);
     }

     public static void main(String[] args) {
         Question8pyq r=new Question8pyq();
     }
 }