import java.awt.*;
//import java.util.List;
public class P2{
    public static void main(String args[]){
        Frame f=new Frame("My Frame");
        f.setVisible(true);
        f.setSize(300,300);
        f.setLayout(new FlowLayout());

        List lst = new List(4, true);
        lst.add("C++");
        lst.add("Java");
        lst.add("C#");
        lst.add("Python");
        lst.add("PHP");

        f.add(lst);

        Choice cb = new Choice();
        cb.add("C++");
        cb.add("Java");
        cb.add("C#");
        cb.add("Python");
        cb.add("PHP");

        f.add(cb);
    }
}
