//Program to demonstrate use of AWT components
import java.awt.*;
//import java.awt.event.*;
public class P1
{
    public static void main(String[] args){
        Frame f = new Frame("My Frame");
        f.setSize(300,300);
        f.setVisible(true);
        
        Label lblname=new Label("Name");
        f.add(lblname);

        TextField txtname=new TextField(20);
        f.add(txtname);

        Label lbladd=new Label("Address");
        f.add(lbladd);

        TextArea txtadd=new TextArea(5,20);
        f.add(txtadd);

        Checkbox chkmale=new Checkbox("Male");
        f.add(chkmale); 
        Checkbox chkfemale=new Checkbox("Female");
        f.add(chkfemale);

        Button btnsave=new Button("Save");
        f.add(btnsave);

    }
}
