//using AWT
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
public class P10 implements KeyListener{
    Label lblaction;
    
    P10(){
        JFrame f=new JFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        lblaction=new Label();
        f.add(lblaction);
        f.addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) { 
        lblaction.setText("Key Pressed");
        
    }

    public void keyReleased(KeyEvent e) {
        lblaction.setText(" ");
        
    }
    
    public void keyTyped(KeyEvent e) {
        //to-do
        
    }
    public static void main(String args[]){
        new P10();
    }

}
