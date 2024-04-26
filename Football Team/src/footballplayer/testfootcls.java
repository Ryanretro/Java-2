package footballplayer;

public class testfootcls {

    public static void main(String[] args) {
        Footballplayer fDribble;
        
        fDribble = new Footballplayer();
        
        fDribble.setPersonallife("Partying");
        fDribble.setPlayingstyle("Sprinting");
        
        System.out.println("My name is Ryan and i like " + fDribble.getPersonallife() + "and i enjoy " + fDribble.getPlayingstyle());
    }
}

