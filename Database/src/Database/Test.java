
package Database;

public class Test {
    
    public static void main(String[] args){
        DBConnection dbc = new DBConnection();
        dbc.getConnection();
        
        DBOperation dbo = new DBOperation();
        dbo.select(2);
        //dbo.insert(3, "Krish", "BBIT");
    }
    
}
