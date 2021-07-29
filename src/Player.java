import java.util.ArrayList;

public class Player {
    private String name;
    private int score;
    private ArrayList<Card> hand = new ArrayList<>();
    private ArrayList<ArrayList<Card>> tricksTaken = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public ArrayList<ArrayList<Card>> getTricksTaken() {
        return tricksTaken;
    }

    public void takeTrick(ArrayList<Card> trick) {
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
        for (Card card : hand) {
            int i = hand.indexOf(card);
            System.out.print(" | card:" + i + " " + card.value + card.suit.toString() + " :numeric value = " + card.numericValue);
        }
        System.out.println();
    }

    public Card playCard(int num) {
        //recieves index number of card to play removes card from players hand displays card and returns card
        Card playedCard = hand.remove(num);
        System.out.println("Card played :" + playedCard.value + playedCard.suit);
        return playedCard;
    }
}