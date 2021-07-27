import java.util.*;

public class Main {
    public static void main(String[] args) {
        int num;
        boolean active;
        Deck gameDeck = new Deck();
        Board board = new Board();
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
        playerTwo.setHand(gameDeck.cardDealer());
        playerThree.setHand(gameDeck.cardDealer());
        playerFour.setHand(gameDeck.cardDealer());

        active = true;

        while (!playerFour.getHand().isEmpty()) {
            System.out.println("round " + board.getRoundsPlayed() + " begin");

            System.out.println(playerOne.getName() + " pick a card");
            playerOne.displayHand();
            num = py.nextInt();
            board.addToTrick(playerOne.playCard(num));
            System.out.println();

            System.out.println(playerTwo.getName() + " pick a card");
            playerTwo.displayHand();
            num = py.nextInt();
            board.addToTrick(playerTwo.playCard(num));
            System.out.println();

            System.out.println(playerThree.getName() + " pick a card");
            playerThree.displayHand();
            num = py.nextInt();
            board.addToTrick(playerThree.playCard(num));
            System.out.println();

            System.out.println(playerFour.getName() + " pick a card");
            playerFour.displayHand();
            num = py.nextInt();
            board.addToTrick(playerFour.playCard(num));
            System.out.println();

            board.returnTrick();

        }

        /*playerOne.setHand(gameDeck.cardDealer());
        System.out.println("P1 hand has" + playerOne.getHand().size());

        playerTwo.setHand(gameDeck.cardDealer());
        System.out.println("P2 hand has" + playerTwo.getHand().size());

        playerThree.setHand(gameDeck.cardDealer());
        System.out.println("P3 hand has" + playerThree.getHand().size());

        playerFour.setHand(gameDeck.cardDealer());
        System.out.println("P4 hand has" + playerFour.getHand().size());*/

        //playerTwo.getHand().forEach(x -> System.out.println(x.value + x.suit.toString()));
        //playerThree.getHand().forEach(x -> System.out.println(x.value + x.suit.toString()));
        //playerFour.getHand().forEach(x -> System.out.println(x.value + x.suit.toString()));


        System.out.println("Player 1: " + playerOne.getName() + "'s tricks taken: " + playerOne.getTricksTaken());
        System.out.println("Player 2: " + playerTwo.getName() + "'s tricks taken: " + playerTwo.getTricksTaken());
        System.out.println("Player 3: " + playerThree.getName() + "'s tricks taken: " + playerThree.getTricksTaken());
        System.out.println("Player 4: " + playerFour.getName() + "'s tricks taken: " + playerFour.getTricksTaken());

        //System.out.println(gameDeck.getDeck().size());
        //Board.printBoardGame();
    }


    public static void greeting() {
        System.out.println("Welcome to Game of Hearts!\n This game will need 4 players to play.");

    }

}
