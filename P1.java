
//Program to demonstrate use of AWT components
import java.awt.*;
//import java.awt.event.*;
public class P1
{
    public static void main(String[] args){
        Frame f = new Frame("My Frame");
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        CheckboxGroup cbg=new CheckboxGroup();

        Label lblname=new Label("Name");
        f.add(lblname);

        TextField txtname=new TextField(20);
        f.add(txtname);

        Label lbladd=new Label("Address");
        f.add(lbladd);

        TextArea txtadd=new TextArea(5,20);
        f.add(txtadd);

        Label lblsubjects=new Label("Select Subjects");

        f.add(lblsubjects);
        Checkbox chkmath=new Checkbox("Math");
        f.add(chkmath); 
        Checkbox chkscience=new Checkbox("Science");
        f.add(chkscience);

        Label lblgender=new Label("Select Gender");
        f.add(lblgender);

        Checkbox chkmale=new Checkbox("Male",cbg,true);
        f.add(chkmale);
        Checkbox chkfemale=new Checkbox("Female",cbg,false);
        f.add(chkfemale);

        Button btnsave=new Button("Save");
        f.add(btnsave);

       
    }
}