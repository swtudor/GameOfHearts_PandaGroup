import java.util.ArrayList;

public class Player {
    private String name;
    private int score;
    private ArrayList<Card> hand = new ArrayList<> ();
    private ArrayList<ArrayList<Card>> tricksTaken = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public ArrayList<ArrayList<Card>> getTricksTaken() {
        return tricksTaken;
    }

    public void takeTrick(ArrayList<Card> trick){
        tricksTaken.add(trick);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }



    public ArrayList<Card> getHand() {
        return hand;

    }
    public void setHand(ArrayList<Card> pHand) {
        this.hand = pHand;
    }



    public void displayHand() {
        //loop through players hand for each card display index number and card value
        for (Card card: hand){
            int i = hand.indexOf(card);
            System.out.print(" | " + i + ": " + card.value + card.suit.toString());
        }
        System.out.println();
    }

    public Card playCard(int num){
        //recieves index number of card to play removes card from players hand displays card and returns card
        Card playedCard = hand.remove(num);
        System.out.println("Card played: " + playedCard.value + playedCard.suit.toString());
        return playedCard;
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
