package footballplayer;

public class Footballplayer {

    
    public String name;
    public int age;
    private String playingstyle;
    private String personallife;
    private String tactics;
    private int playermorale;
    
    
    private void practice(){
        String motivation = "I need to work hard";
        System.out.println(motivation);
    }
    
    
 private void increaseMorale() {
        if (playermorale < 80) {
            playermorale += 10;
            System.out.println("Player's morale has improved to " + playermorale);
        } else {
            System.out.println("Player's morale is already high at " + playermorale);
        }
    }
 
 
    public void setPlayingstyle(String skill){
        playingstyle = skill;
    }
    public String getPlayingstyle(){
        return playingstyle;
    }
    public void setPersonallife(String hide){
        personallife = hide;
    }
    public String getPersonallife(){
        return personallife;
    }
    public void setTactics(String dribble){
        tactics = dribble;
    }
    public String getTactics(){
        return tactics;
    }
}