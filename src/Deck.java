import java.util.*;


public class Deck {

    private static final ArrayList<Card> deck = deckBuilder();

    private ArrayList<Card> copyDeck = (ArrayList<Card>) deck.clone();

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
        if (copyDeck.size() == 0){
            copyDeck = (ArrayList<Card>) deck.clone();
        }
        ArrayList<Card> tempHand = new ArrayList<>();
        Collections.shuffle(copyDeck);
        for (int i = 0; i <= 12; i++){
            tempHand.add(copyDeck.remove(i));
        }
        return tempHand;
        //How long is the copy list
        //If size = 0, refill with fresh copy
        //create a temp list for current hand
        //shuffle copy list
        //loop 13 times
        //add values to temp list
        //remove value from copy list
        //return temp list of 13

    }
}
