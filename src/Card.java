public class Card {
    Suit suit;
    String value;
    int numericValue;

    public static enum Suit {
        HEARTS, CLUBS, DIAMONDS, SPADES;
    }

    public Card(Suit suit, String cValue, int numericValue) {
        this.suit = suit;
        this.value = cValue;
        this.numericValue = numericValue;
    }
}

