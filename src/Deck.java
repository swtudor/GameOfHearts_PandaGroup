import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Deck {

    private static final ArrayList<Card> deck = deckBuilder();

    public ArrayList<Card> getDeck() {
        return deck;
    }

    private static ArrayList<Card> deckBuilder() {
        ArrayList<Card> fullDeck = new ArrayList<>();
        //for every suit in the list of suits
        for (Card.Suit newSuit : Card.Suit.values()) {
            for (int value = 1; value <= 13; value++) {
                //building the suit and assigning a value for each card
                Card newCard = new Card(newSuit, faceValue(value));
                //full deck added cards to it
                fullDeck.add(newCard);
            }

            //find face value base on location inner loop
            //create a new card add to deck
        }
        return fullDeck;
    }

    private static String faceValue(int value) {
        String faceValue = "";
        switch (value) {
            case 1:
                faceValue = "2";
                break;
            case 2:
                faceValue = "3";
                break;
            case 3:
                faceValue = "4";
                break;
            case 4:
                faceValue = "5";
                break;
            case 5:
                faceValue = "6";
                break;
            case 6:
                faceValue = "7";
                break;
            case 7:
                faceValue = "8";
                break;
            case 8:
                faceValue = "9";
                break;
            case 9:
                faceValue = "10";
                break;
            case 10:
                faceValue = "J";
                break;
            case 11:
                faceValue = "Q";
                break;
            case 12:
                faceValue = "K";
                break;
            case 13:
                faceValue = "A";
                break;
        }
        return faceValue;
    }
    private void cardShuffle() {
        Collections.shuffle(deck);
    }
    public ArrayList<Card> cardDealer() {
        // how to make 4 unigue hands of 13 cards
        // no static copy. taking unique cards out of the deck
        //13 cards per player
        //Use the card shuffle
        // void method changing what is happening in the list everytime
     return new ArrayList<>();
    }
}
