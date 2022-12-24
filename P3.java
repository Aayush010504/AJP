//design a simple calculator using gridlayout
import java.awt.*;
import javax.swing.*;


public class P3 extends JFrame{
    
    public static void main(String args[]){
        Frame f=new Frame("My Frame");
        f.setLayout(new GridLayout(2,1));
        f.setSize(300,300);
        f.setVisible(true);
        
        TextField txtvalue=new TextField();
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btn0 = new Button("0");
        Button btnadd = new Button("+");
        Button btnsub = new Button("-");
        Button btnmul = new Button("*");
        Button btndiv = new Button("/");
        Button btnequal = new Button("=");
        Button btnclear = new Button("C");

        f.add(txtvalue);
        
        JPanel p=new JPanel(new GridLayout(4,3));
        p.setBounds(10,220,500,500);
        f.add(p);

        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        p.add(btn5);
        p.add(btn6);
        p.add(btn7);
        p.add(btn8);
        p.add(btn9);
        p.add(btn0);
        p.add(btnadd);
        p.add(btnsub);
        p.add(btnadd);
        p.add(btnmul);
        p.add(btndiv);
        p.add(btnequal);
        p.add(btnclear);

        //new cal();
    }
}