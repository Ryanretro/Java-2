package Strathmore;

public class Singer {
    //Three instance variables
    public String singerStageName;
    public String singerBirthName;
    public int singerAge;
    
    //Three static variables
    public static String singerProducer;
    public static String singerRecordLabel;
    public static String singerGenre;
    
    //Default Constructor
    public Singer(){
        singerProducer = "Dax";
        singerRecordLabel = "Living Legends";
        singerGenre = "HipHop/Rap";
    
}
    
    //Parameterized constructor
    public Singer(String singerStageName, String singerBirthName, int singerAge){
        this.singerStageName = singerStageName;
        this.singerBirthName = singerBirthName;
        this.singerAge = singerAge;
        
    }
    
    //other methods
    public void rap(){
        System.out.println("cxcjckckdk");
    }
    
    public String sing(){
        String lyrics = "one last problem";
        return lyrics;
    }
    
    public String tour(String location){
        String lyrics = location+", make some noise";
        return lyrics;
    }
    
    public void introduce(){
        System.out.println("Hello, I am ," + singerStageName+"I sing HipHop");
    }
}