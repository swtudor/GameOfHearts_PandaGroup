import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck gameDeck = new Deck();
        Collections.shuffle(gameDeck.getDeck());
        //System.out.println(gameDeck.deck().getDeck);
        //gameDeck.getDeck().forEach(x-> System.out.println(x.value + x.suit.toString()));


        Scanner py = new Scanner(System.in);
        System.out.println("Enter each player's name (click Enter after each name): ");
        String oneName = py.nextLine();
        String twoName = py.nextLine();
        String threeName = py.nextLine();
        String fourName = py.nextLine();
        Player playerOne = new Player(oneName);
        Player playerTwo = new Player(twoName);
        Player playerThree = new Player(threeName);
        Player playerFour = new Player(fourName);

        playerOne.setHand(gameDeck.cardDealer());
        System.out.println("P1 hand has" + playerOne.getHand().size());

        playerTwo.setHand(gameDeck.cardDealer());
        System.out.println("P2 hand has" + playerTwo.getHand().size());

        playerThree.setHand(gameDeck.cardDealer());
        System.out.println("P3 hand has" + playerThree.getHand().size());

        playerFour.setHand(gameDeck.cardDealer());
        System.out.println("P4 hand has" + playerFour.getHand().size());

        playerOne.getHand().forEach(x -> System.out.println(x.value + x.suit.toString()));
        //playerTwo.getHand().forEach(x -> System.out.println(x.value + x.suit.toString()));
        //playerThree.getHand().forEach(x -> System.out.println(x.value + x.suit.toString()));
        //playerFour.getHand().forEach(x -> System.out.println(x.value + x.suit.toString()));


        System.out.println("Player 1: " + playerOne.getName());
        System.out.println("Player 2: " + playerTwo.getName());
        System.out.println("Player 3: " + playerThree.getName());
        System.out.println("Player 4: " + playerFour.getName());

        System.out.println(gameDeck.getDeck().size());
        Board.printBoardGame();




    }


    public void greeting() {
        System.out.println("Welcome to Game of Hearts!\n This game will need 4 players to play.");

    }

}
