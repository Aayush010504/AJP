//Write a program to demonstrate various mouse events using MouseListener and MouseMotionListener interface
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class P11 implements MouseListener, MouseMotionListener{
    Label lblaction;
    P11(){
        JFrame f=new JFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        lblaction=new Label();
        f.add(lblaction);
        f.addMouseListener(this);
        f.addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent e) {    //mouse clicked
        lblaction.setText("Mouse Clicked");
        
    }
    public void mouseEntered(MouseEvent e) {    //mouse entered
        lblaction.setText("Mouse Entered");
        
    }
    public void mouseExited(MouseEvent e) {    //mouse exited
        lblaction.setText("Mouse Exited");
        
    }
    public void mousePressed(MouseEvent e) {    //mouse pressed
        lblaction.setText("Mouse Pressed");
        
    }
    public void mouseReleased(MouseEvent e) {   //mouse released
        lblaction.setText("Mouse Released");
        
    }
    public void mouseDragged(MouseEvent e) {    //mouse dragged
        lblaction.setText("Mouse Dragged");
        
    }
    public void mouseMoved(MouseEvent e) {  //mouse moved
        lblaction.setText("Mouse Moved");
        
    }
    public static void main(String args[]){   
        new P11();
    }
}
