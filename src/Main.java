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
        //System.out.println(gameDeck.getDeck().size());

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
        playerTwo.setHand(gameDeck.cardDealer());
        playerThree.setHand(gameDeck.cardDealer());
        playerFour.setHand(gameDeck.cardDealer());

        playerOne.getHand().forEach(x -> System.out.println(x.value + x.suit.toString()));
        playerTwo.getHand().forEach(x -> System.out.println(x.value + x.suit.toString()));
        playerThree.getHand().forEach(x -> System.out.println(x.value + x.suit.toString()));
        playerFour.getHand().forEach(x -> System.out.println(x.value + x.suit.toString()));


        System.out.println("Player 1: " + playerOne.getName());
        System.out.println("Player 2: " + playerTwo.getName());
        System.out.println("Player 3: " + playerThree.getName());
        System.out.println("Player 4: " + playerFour.getName());

        Board.printboardGame();
    }


    public void greeting() {
        System.out.println("Welcome to Game of Hearts!\n This game will need 4 players to play.");

    }

}
