package GUI;



import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;



public class OperationsFrame extends JFrame {
    
        // Create labels 
        JLabel titleLbl;
        JLabel idLbl;
        JLabel nameLbl;
        JLabel courseLbl;
        JLabel gradeLbl;
        
        
        // Create textfields
        JTextField idTxtf;
        JTextField nameTxtf;
        JTextField courseTxtf;
        JTextField gradeTxtf;
        
        
        // Create Buttons
        JButton selectBtn;
        JButton updateBtn;
        JButton insertBtn;
        JButton deleteBtn;

        //Create a panel
        JPanel btnPanel = new JPanel();
        
        
        // Declare a Layout Manager for our components
     GridLayout gl;
     
     
     // Declare our fonts
     Font plainFont;
     Font boldFont;
   
      //declare a no arguement constructor
    public OperationsFrame(){
        setTitle("DB Operations GUI");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        
        
        //SET DIFFERNT FRONT TO USE
        plainFont = new Font("ITALICS", Font.PLAIN,18);
        boldFont = new Font("TIMES NEW ROMAN",Font.BOLD,28);
        
        
        // Set up Layout for components
        gl = new GridLayout(10,3,0,15);
        setLayout(gl);
        
        
        // invoke methods that build up the components
        setButtonComponents();
        setLabelComponents();
        setTextFieldComponents();
        
        //Set background color
        getContentPane().setBackground(Color.BLUE);
        
        //add components
        add(titleLbl);
        add(idLbl);
        add(idTxtf);
        add(nameLbl);
        add(nameTxtf);
        add(courseLbl);
        add(courseTxtf);
        add(gradeLbl);
        add(gradeTxtf);

        add(btnPanel);
        
        

    }
    
    public final void setLabelComponents(){
        titleLbl = new JLabel();
        titleLbl.setText("Student Database Operations");
        titleLbl.setFont(boldFont);
        titleLbl.setHorizontalAlignment(SwingConstants.CENTER);

        idLbl = new JLabel();
        idLbl.setText("Student Id Number");
        idLbl.setFont(plainFont);
        idLbl.setHorizontalAlignment(SwingConstants.CENTER);

        nameLbl = new JLabel();
        nameLbl.setText("Student Name");
        nameLbl.setFont(plainFont);
        nameLbl.setHorizontalAlignment(SwingConstants.CENTER);

        courseLbl = new JLabel();
        courseLbl.setText("Student Course");
        courseLbl.setFont(plainFont);
        courseLbl.setHorizontalAlignment(SwingConstants.CENTER);

        gradeLbl = new JLabel();
        gradeLbl.setText("Student Grade");
        gradeLbl.setFont(plainFont);
        gradeLbl.setHorizontalAlignment(SwingConstants.CENTER);
    }
    public final void setTextFieldComponents (){
        idTxtf = new JTextField();
        idTxtf.setFont(plainFont);
        idTxtf.setHorizontalAlignment(SwingConstants.CENTER);

        nameTxtf = new JTextField();
        nameTxtf.setFont(plainFont);
        nameTxtf.setHorizontalAlignment(SwingConstants.CENTER);

        courseTxtf = new JTextField();
        courseTxtf.setFont(plainFont);
        courseTxtf.setHorizontalAlignment(SwingConstants.CENTER);

        gradeTxtf = new JTextField();
        gradeTxtf.setFont(plainFont);
        gradeTxtf.setHorizontalAlignment(SwingConstants.CENTER);
    }
    public final void setButtonComponents (){
        selectBtn = new JButton();
        selectBtn.setText("Search");
        selectBtn.setFont(plainFont);
        selectBtn.setHorizontalAlignment(SwingConstants.CENTER);
        selectBtn.addActionListener((ActionEvent e) -> {searchAction();});

        insertBtn = new JButton();
        insertBtn.setText("Insert");
        insertBtn.setFont(plainFont);
        insertBtn.setHorizontalAlignment(SwingConstants.CENTER);
        insertBtn.addActionListener((ActionEvent e) -> {insertAction();});

        updateBtn = new JButton();
        updateBtn.setText("Update");
        updateBtn.setFont(plainFont);
        updateBtn.setHorizontalAlignment(SwingConstants.CENTER);
        updateBtn.addActionListener((ActionEvent e) -> {updateAction();});

        deleteBtn = new JButton();
        deleteBtn.setText("Delete");
        deleteBtn.setFont(plainFont);
        deleteBtn.setHorizontalAlignment(SwingConstants.CENTER);
        deleteBtn.addActionListener((ActionEvent e) -> {deleteAction();});


        btnPanel.setLayout(new GridLayout(1,4,10,10));
       btnPanel.setSize(WIDTH, 50);
        btnPanel.add(selectBtn);
        btnPanel.add(insertBtn);
        btnPanel.add(updateBtn);
        btnPanel.add(deleteBtn);
    }
    public void searchAction(){
        int id = Integer.parseInt(idTxtf.getText());
        Database.DBOperations dbo = new Database.DBOperations();
        dbo.select(id);
        
         // Display a confirmation message using JOptionPane
        JOptionPane.showMessageDialog(this, "Search completed", "Search Result", JOptionPane.INFORMATION_MESSAGE);
       }

    public void insertAction(){
        int id = Integer.parseInt(idTxtf.getText());
        String name = nameTxtf.getText();
        String course = courseTxtf.getText();
        Float grade = Float.valueOf(gradeTxtf.getText());

        Database.DBOperations dbo = new Database.DBOperations();
        dbo.insert(id, name, course, grade);
        
        
         // Display a confirmation message using JOptionPane
    JOptionPane.showMessageDialog(this, "Student record inserted successfully", "Insert Result", JOptionPane.INFORMATION_MESSAGE);

        idTxtf.setText(" ");
        nameTxtf.setText(" ");
        courseTxtf.setText(" ");
        gradeTxtf.setText(" ");
    }
    public void updateAction(){
        int id = Integer.parseInt(idTxtf.getText());
        String name = nameTxtf.getText();
        float grade = Float.parseFloat(gradeTxtf.getText());
        
        Database.DBOperations dbo = new Database.DBOperations();
        dbo.update("ICS", "JOSH", 90, 6);
        
        
         // Display a confirmation message using JOptionPane
    JOptionPane.showMessageDialog(this, "Student record updated successfully", "Update Result", JOptionPane.INFORMATION_MESSAGE);

        
        //Clear text fields after update
        idTxtf.setText(" ");
        nameTxtf.setText(" ");
        gradeTxtf.setText(" ");
        
    }
    public void deleteAction(){
       int id = Integer.parseInt(idTxtf.getText());
       
       Database.DBOperations dbo = new Database.DBOperations();
       dbo.delete(id);
       
       
        // Display a confirmation message using JOptionPane
    JOptionPane.showMessageDialog(this, "Student record deleted successfully", "Delete Result", JOptionPane.INFORMATION_MESSAGE);

       
       //Clear text field after deletion
       idTxtf.setText(" ");
       
    }
    
    public static void main(String[] args){ 
        OperationsFrame OF = new OperationsFrame();
        OF.setVisible(true);
        
    }
    
    
}