import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.JFrame;
public class P7 {
    public static void main(String args[]){

        JFrame f=new JFrame();
        
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        
        DefaultMutableTreeNode rootnode=new DefaultMutableTreeNode("India");
        JTree jt=new JTree(rootnode);
        f.add(jt);
        
        DefaultMutableTreeNode gujnode=new DefaultMutableTreeNode("Gujrat");
        rootnode.add(gujnode);

        DefaultMutableTreeNode ahemnode=new DefaultMutableTreeNode("Ahemdabad");
        gujnode.add(ahemnode);
        DefaultMutableTreeNode sutnode=new DefaultMutableTreeNode("Surat");
        gujnode.add(sutnode);
        DefaultMutableTreeNode gnnode=new DefaultMutableTreeNode("Gandhi Nagar");
        gujnode.add(gnnode);

        DefaultMutableTreeNode msnode=new DefaultMutableTreeNode("Maharashtra");
        rootnode.add(msnode);

        DefaultMutableTreeNode mumnode=new DefaultMutableTreeNode("Mumbai");
        msnode.add(mumnode);
        DefaultMutableTreeNode punenode=new DefaultMutableTreeNode("Pune");
        msnode.add(punenode);

        
    }
    
}
