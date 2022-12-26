//Write a program to create a two-level card deck that allows the user to select component of Panel using CardLayout

// Path: P5.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class P4 extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4;      //Button declaration
    Container c;
    CardLayout card;

    P4()
    {
        c=getContentPane();
        card=new CardLayout(40,30);
        c.setLayout(card);

        b1=new JButton("Apple");
        b2=new JButton("Mango");
        b3=new JButton("Banana");
        b4=new JButton("Grapes");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    
        c.add("a",b1);
        c.add("b",b2);
        c.add("c",b3);
        c.add("d",b4);
    }
    public void actionPerformed(ActionEvent e){
        card.next(c);
    }
    
    public static void main(String args[]){
        P4 p=new P4();
        p.setSize(400,400);
        p.setVisible(true);
    }
    
}