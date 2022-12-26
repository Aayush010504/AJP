import javax.swing.*;
import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class P6 extends JFrame implements ItemListener 
{
    JLabel jLabelobj;

    P6()
    {   
        //JFrame jf= new JFrame();
        JComboBox jComboBoxobj =new JComboBox();
        jComboBoxobj.addItem("Solapur");
        jComboBoxobj.addItem("Pune");
        jComboBoxobj.addItem("Banglore");
        jComboBoxobj.addItem("Mumbai");
        jComboBoxobj.addItemListener(this); 
        jLabelobj=new JLabel();

        add(jComboBoxobj);
        add(jLabelobj);
        
        JScrollPane s=new JScrollPane(jComboBoxobj);  
        //s.setBounds(100,100, 50,100);  
        add(s);
    }
    
    public void itemStateChanged(ItemEvent ie)
    {
        String state=(String)
        ie.getItem();
        jLabelobj.setText("You are in "+state);
    }

    public static void main(String args[])
    {
        P6 jc = new P6();
        jc.setLayout(new FlowLayout());
        jc.setSize(400,400);
        jc.setVisible(true);

    }
}

