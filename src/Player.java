import java.util.ArrayList;

public class Player {
    String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private ArrayList<Card> hand = new ArrayList<> ();

    public ArrayList<Card> getHand() {
        return hand;

    }
    public void setHand(ArrayList<Card> pHand) {
        this.hand = pHand;
    }
}//end of Player class


//string array list for player hand
//ArrayList values = ... // your values
// Set uniqueValues = new HashSet(values); //now unique

//writing a loop to alternate between four players.
//The loop breaks when there is a winner
//Have at last four players

//public static void currentPlayer() {
//  private c[] players;
//public Player(c... players) {
//this.players = players;
//reset();
    /*}
    public c current() {
    }
    public c next() {
    }
    public void reset() {
    }
} */
