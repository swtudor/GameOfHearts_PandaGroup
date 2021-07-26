import java.util.ArrayList;

public class Card {
    Suit suit;
    String value;

    public static enum Suit {
        HEARTS, ClUBS, DIAMONDS, SPADES;
    }

    public Card(Suit suit, String cValue) {
        this.suit = suit;
        this.value = cValue;
    }
}

