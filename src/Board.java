import java.util.ArrayList;

public class Board {
    //understanding Board logic
    //The board should handle card tricks and assign them to the correct player
    //Act as the controller for game logic
    //Make 4 player objects?
    //keep track of rounds played
    //keep track of the winner
    //track what the leading suit is

    private ArrayList<Card> activeTrick = new ArrayList<>();

    public int getRoundsPlayed() {
        return roundsPlayed;
    }

    public void setRoundsPlayed(int roundsPlayed) {
        this.roundsPlayed = roundsPlayed;
    }

    private int roundsPlayed = 1;

    private Card.Suit leadSuit;

    //player method to add card to trick
    public void addToTrick(Card card) {
        if (activeTrick.isEmpty()) {
            //set lead suit
            leadSuit = card.suit;
        }
        activeTrick.add(card);
    }

    public ArrayList<Card> returnTrick() {
        //if the round is completed the trick will have 4 cards
        //empty the list and return the list of tricks
        ArrayList<Card> trick = activeTrick;
        activeTrick.clear();
        roundsPlayed++;
        return trick;
    }


    ///public void printBoard() {
    public static char[][] gameBoard = {
            {' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' '},
            {'|', ' ', ' ', '|', '|', ' ', ' ', '|', '|', ' ', ' ', '|', '|', ' ', ' ', '|', '|', ' ', ' ', '|', '|', ' ', ' ', '|', '|', ' ', ' ', '|', '|', ' ', ' ', '|', '|', ' ', ' ', '|', '|', ' ', ' ', '|', '|', ' ', ' ', '|', '|', ' ', ' ', '|', '|', ' ', ' ', '|'},
            {' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' ', ' ', '-', '-', ' '}


    };


    // each player card corresponds to a specific number for each card. using a switch statement.
    public static void printBoardGame() {
        for (char[] row : gameBoard) { // row
            for (char col : row) { //column
                System.out.print(col);
            }
            System.out.println();
        }
    }
}


