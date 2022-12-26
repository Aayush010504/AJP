import javax.swing.*;

public class P8 extends JFrame {
    JFrame f;    
    P8(){    
        f=new JFrame();  

        String data[][]={ {"101","Amit","670000"},    
                            {"102","Jai","780000"},    
                            {"101","Sachin","700000"},
                            {"103","Rahul","800000"},
                            {"104","Omkar","900000"},
                            {"105","Rahul","800000"}};
            

        String column[]={"ID","NAME","SALARY"};     

        JTable jt=new JTable(data,column);    

        JScrollPane sp=new JScrollPane(jt);    

        
        f.add(sp);          
        f.setSize(300,400);    
        f.setVisible(true);    
    }     
        
    public static void main(String args[]){
        new P8();
    }
}  
