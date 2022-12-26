import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class P12 extends JFrame implements ActionListener{
    JPasswordField txtpass; //JPasswordfield class declaration
    JTextField txtuname;    //Jtextfield declaration
    JLabel lbl1,lbl2,lbl3;  //Jlabel declaration
    JButton btn1;           //Jbutton declaration
            
    P12(){
        setSize(300,300);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        
        lbl1=new JLabel("Enter Username");
        txtuname=new JTextField(20);
        
        lbl2=new JLabel("Enter Password");
        txtpass=new JPasswordField(20);
        txtpass.setEchoChar("*".charAt(0));

        btn1=new JButton("Submit");
        btn1.addActionListener(this);

        lbl3=new JLabel("");
 
        add(lbl1);
        add(txtuname);
        add(lbl2);
        add(txtpass);
        add(lbl3);
        add(btn1);

    }

    public void actionPerformed(ActionEvent e){
        String s=new String(txtpass.getPassword());
        if(s.equals("Admin")==true){
            lbl3.setText("Authentication Successful, welcome " +txtuname.getText());
        }
        else{
            lbl3.setText("Authentication Failed");
        }
    }

    public static void main(String args[])
    {
        new P12();
    }
}
