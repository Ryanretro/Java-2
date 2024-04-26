package Database;

import java.sql.*;

public class DBConnection {
    
    String database = "university";
    
    //API:DBMS://server:port/databaseName
    String url = "jdbc:postgresql://localhost:5432/" + database;
    String username = "postgres";
    String password = "postgres";
    
    Connection con = getConnection();

    public Connection getConnection() {
       Connection connection = null;
       
        //Step 1: Load Driver
       try{
           Class.forName("org.postgresql.Driver");
           System.out.println("Driver loaded succesfully");
          }catch(ClassNotFoundException cnfe)
       
       {
           System.out.println("Could not load Driver : " + cnfe.getMessage());
       }
       
       
       //Step 2: Establish Connection
        try{
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully connected to Database");
           }catch(SQLException sqle)
        
        {
            System.out.println("Could not connect to database :"+sqle.getMessage());
        }
       
       
     return connection;
    }
    
}
