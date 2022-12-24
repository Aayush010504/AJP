import java.awt.*;
public class P5 {
    Frame f;

    P5(){
        f=new Frame("My Frame");
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(new FlowLayout());

        MenuBar mb =new MenuBar();
        f.setMenuBar(mb);

        Menu file=new Menu("File");
        mb.add(file);

        MenuItem minew = new MenuItem("New");
        file.add(minew);
        MenuItem miopen = new MenuItem("Open");
        file.add(miopen);
        
        Menu edit = new Menu("Edit");
        mb.add(edit);

        Menu view = new Menu("View");
        mb.add(view);

        Menu create = new Menu("Create");
        mb.add(create);

    }
    public static void main(String args[]){
        new P5();
    }

}
