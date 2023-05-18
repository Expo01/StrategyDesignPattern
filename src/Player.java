

public class Player {
    IStrategy behavior; // player object with field of IStrategy Interface
    String type; // this is just whatever we name the role as either attacker or defender or something like that

    public Player(String type) {  //constructor for type only
        this.type = type;
    }

    public void setStrategy(IStrategy behavior) { // strategy set from main not via construtor
        this.behavior = behavior;
    }

    public void action(){
        System.out.println("player: " + this.type);
        behavior.actionCommand();
    }
}
