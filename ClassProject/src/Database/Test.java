package Database;


public class Test {
    public static void main(String[] args){
        DBConnection dbc = new DBConnection();
        dbc.getConnection();
        
        DBOperations dbo = new DBOperations();
        
        dbo.update("Ryan", "ICS", 6, 87);

        
        // Test the select method
        dbo.select(1);
        

        // Test the delete method
        dbo.delete(3);
        
        // Test the insert method
        dbo.insert(4, "Kimberly Keke", "DBIT", 85.5f);

    }
    


    
}
        
    