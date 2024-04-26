
package Database;

import java.sql.*;

public class DBOperation extends DBConnection{
    
    public void insert(int id, String name, String course){
        //INSERT INTO students (studentid, studentname, studentcourse) VALUES (5, 'Nikhil', 'DBIT');
        String query = "INSERT INTO students (studentid, studentname, studentscourse) VALUES (?, ?, ?)";
        
        try{
        // Step 3: Create Statement
        PreparedStatement pst;
        pst = con.prepareStatement(query);
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setString(3, course);
        
        // Step 4: Execute Statement
        pst.executeUpdate();
        System.out.println("Successfully added " + name);
        
        
        // Step 5: Process ResultSet
        // Step 6: Close The Connection
           con.close();
        }catch(SQLException sqle){
            System.out.println("Could not insert student");
            System.out.println(sqle.getMessage());
        }
    }
    
    public void select(int studId){
        //SELECT * FROM students WHERE studentId = 1;
        String query = "SELECT * FROM students WHERE studentId = ?";
        
        try{
        // Step 3: Create Statement
        PreparedStatement pst;
        pst = con.prepareStatement(query);
        pst.setInt(1, studId);
        
       
        // Step 4: Execute Statement
           ResultSet rs = pst.executeQuery();
           
           
        // Step 5: Process ResultSet
           while(rs.next()){
               String id  = rs.getString("studentid");
               String name = rs.getString("studentname");
               String course =  rs.getString("studentscourse");
               
               String output = id + " " + name + " " + course;
               System.out.println(output);
           }
        // Step 6: Close The Connection
           
        
        }catch(SQLException sqle){
            System.out.println("Could not Select student");
            System.out.println(sqle.getMessage());
        }
    }
    
    public void update(){
        // Step 3: Create Statement
        // Step 4: Execute Statement
        // Step 5: Process ResultSet
        // Step 6: Close The Connection
    }
    
    public void delete(){
        // Step 3: Create Statement
        // Step 4: Execute Statement
        // Step 5: Process ResultSet
        // Step 6: Close The Connection
    }
}