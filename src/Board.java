import java.util.ArrayList;
import java.util.stream.Collectors;

public class Board {

    private ArrayList<Card> activeTrick = new ArrayList<>();

    public int getRoundsPlayed() {
        return roundsPlayed;
    }

    public void setRoundsPlayed(int roundsPlayed) {
        this.roundsPlayed = roundsPlayed;
    }

    private int roundsPlayed = 1;

    public Card.Suit getLeadSuit() {
        return leadSuit;
    }

    private Card.Suit leadSuit;

    //player method to add card to trick
    public boolean addToTrick(Card card, ArrayList<Card> playerHand) {
        if (activeTrick.isEmpty()) {
            //set lead suit
            leadSuit = card.suit;
            activeTrick.add(card);
            return true;
        } else {
            //Check that the card played is of the right suit
            //if not, display a message that says play a card of the correct suit
            if (card.suit == leadSuit) {
                activeTrick.add(card);
                return true;
            } else {
                if (playerHand.stream().filter(c -> c.suit == leadSuit).collect(Collectors.toList()).isEmpty()) {
                    activeTrick.add(card);
                    return true;
                }
                System.out.println("The card must be " + leadSuit);
                return false;
            }
        }
    }

    public ArrayList<Card> returnTrick() {
        //if the round is completed the trick will have 4 cards
        //empty the list and return the list of tricks
        ArrayList<Card> trick = activeTrick;
        activeTrick.clear();
        roundsPlayed++;
        return trick;
    }
}


