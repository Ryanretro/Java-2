
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {
    
    JLabel titleLbl;
    JLabel idLbl;
    JTextField idTxtf;
    JButton searchBtn;
    
    Font boldFont = new Font("garamond", Font.BOLD, 18);
    Font plainFont = new Font("garamond", Font.PLAIN, 18);
    
    GridLayout gl = new GridLayout(3,5,10,10);
    
    
    
    public MyFrame(){
        
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(gl);
        
        _init_comps();
        
        add(titleLbl);

        add(idLbl);

        add(idTxtf);

        add(searchBtn);
    }
    
    public void _init_comps(){
        titleLbl = new JLabel();
        titleLbl.setText("Student Selector");
        titleLbl.setFont(boldFont);
        titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        idLbl = new JLabel();
        idLbl.setText("Enter Student ID");
        idLbl.setFont(plainFont);
        idLbl.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        idTxtf = new JTextField();
        idTxtf.setText("Hello");
        idTxtf.setFont(boldFont);
        idTxtf.setHorizontalAlignment(SwingConstants.CENTER);
                
    
        searchBtn = new JButton();
        searchBtn.setText("Search");
        searchBtn.setFont(boldFont);
        searchBtn.setHorizontalAlignment(SwingConstants.CENTER);
        searchBtn.addActionListener((ActionEvent e)->{searchBtnAction();});
        
    }
    public void searchBtnAction(){
        String id = idTxtf.getText();
        
        int idInt = Integer.parseInt(id);
        
        Database.DBOperation dbo = new Database.DBOperation();
        dbo.select(idInt);
    }
   
    public static void main(String[] args){
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
    }
}
