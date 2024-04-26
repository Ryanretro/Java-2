package Database;

import java.sql.*;


public class DBOperations extends DBConnection{
    public void insert(int id, String name, String course,float grade){
        String query = "INSERT INTO student (studentid, studentname, studentcourse, studentavggrade) VALUES (?, ? ,?, ? )";
        
          try{
            //step 3: Create statement
              PreparedStatement pst;
              pst = con.prepareStatement(query);
              pst.setInt(1, id);
              pst.setString(2, name);
              pst.setString(3, course);
              pst.setFloat(4,grade);
    
    
            //step 4: Execute statement
              pst.executeUpdate();
              System.out.println("Successfully added " + name);
            //step 6: Close Connection
              con.close();
        
        }catch(SQLException sqle){
            System.out.println("Could not insert student");
            System.out.println(sqle.getMessage());
            
            }
        }
        
public void select(int studentid){
    
    //SELECT * FROM students where id = 1 ;
    String query = "SELECT * FROM student where studentid = ? ";
    
       try{
           //step 3: Create statement
           PreparedStatement pst;
           pst = con.prepareStatement(query);
           pst.setInt(1,studentid);
    
          //step 4: Execute statement
    
           ResultSet rs = pst.executeQuery();
    
         //step 5: Process Result
    
    while(rs.next()){
               String id  = rs.getString("studentid");
               String Name = rs.getString("studentname");
               String Course =  rs.getString("studentcourse");
        float grade = rs.getFloat("studentavggrade");
        
        String output = id + " " + Name + " " + Course + " " + grade;
        System.out.println(output);
    }
    
        //step 6: Close Connection
        
        }catch(SQLException sqle){
            System.out.println("Could not Select student");
            System.out.println(sqle.getMessage());
        }
    
    }
    
        public void update(String Name, String Course, float Grade,int Id
        ){
        String query = "UPDATE student SET studentname = ?, studentcourse = ?, studentavggrade = ? WHERE studentid = ?";
        
        
     try{
            //step 3: Create statement
    PreparedStatement pst;
    pst = con.prepareStatement(query);
    pst.setString(1, "New Name ");
    pst.setString(2, "New Course");
    pst.setFloat(3, 95);
    pst.setInt(4, 4);
    
    
      //step 4: Execute statement
    pst.executeUpdate();
    String output = Id + " " + Name+ " " + Course + " " + Grade;
    System.out.println(output);
      //step 6: Close Connection
    con.close();
        
        }catch(SQLException sqle){
            System.out.println("Could not update student details");
            System.out.println(sqle.getMessage());
            
            }

    }
    
    public void delete(int id){
        String query = "DELETE FROM student WHERE studentid = ?";
        try{
            //step 3: Create statement
    PreparedStatement pst;
    pst = con.prepareStatement(query);
    pst.setInt(1, id);
   
    
    
      //step 4: Execute statement
    pst.executeUpdate();
    System.out.println("Successfully deleted student " + id);
      //step 6: Close Connection
    con.close();
        
        }catch(SQLException sqle){
            System.out.println("Could not delete student");
            System.out.println(sqle.getMessage());
            
            }
        }
    
    }