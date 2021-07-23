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

    /*private static String cardNumber(int number) {
        ArrayList<Card>  cardNumber;
        switch (number) {
            case 1:
                cardNumber = 0;
                break;
            case 2:
                cardNumber = 1;
                break;
            case 3:
                cardNumber = 2;
                break;
            case 4:
                cardNumber = 3;
                break;
            case 5:
                cardNumber = 4;
                break;
            case 6:
                cardNumber = 5;
                break;
            case 7:
                cardNumber = 6;
                break;
            case 8:
                cardNumber = 7;
                break;
            case 9:
                cardNumber = 8;
                break;
            case 10:
                cardNumber = 9;
                break;
            case 11:
                cardNumber = 10;
                break;
            case 12:
                cardNumber = 11;
                break;
            case 13:
                cardNumber = 12;
                break;
        }

    }*/
}

