import java.util.*;

public class Main {
    public static void main(String[] args) {
        int num;
        boolean active;
        Deck gameDeck = new Deck();
        Board board = new Board();
        Collections.shuffle(gameDeck.getDeck());
        greeting();
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

            playerOne.displayHand();
            do {
                System.out.println(playerOne.getName() + " pick a card");
                num = py.nextInt();
            } while (!board.addToTrick(playerOne.getHand().get(num), playerOne.getHand()));
            playerOne.playCard(num);
            System.out.println("Current suit is " + board.getLeadSuit());
            System.out.println();


            playerTwo.displayHand();
            do {
                System.out.println(playerTwo.getName() + " pick a card");
                num = py.nextInt();
            } while (!board.addToTrick(playerTwo.getHand().get(num), playerTwo.getHand()));
            playerTwo.playCard(num);
            System.out.println("Current suit is " + board.getLeadSuit());
            System.out.println();

            playerThree.displayHand();
            do {
                System.out.println(playerThree.getName() + " pick a car");
                num = py.nextInt();
            } while (!board.addToTrick(playerThree.getHand().get(num), playerThree.getHand()));
            playerThree.playCard(num);
            System.out.println("Current suit is " + board.getLeadSuit());
            System.out.println();


            playerFour.displayHand();
            do {
                System.out.println(playerFour.getName() + " pick a card");
                num = py.nextInt();
            } while (!board.addToTrick(playerFour.getHand().get(num), playerFour.getHand()));
            playerFour.playCard(num);
            System.out.println("Current suit is " + board.getLeadSuit());
            System.out.println();

            board.returnTrick();

        }

        System.out.println("Player 1: " + playerOne.getName() + "'s tricks taken: " + playerOne.getTricksTaken());
        System.out.println("Player 2: " + playerTwo.getName() + "'s tricks taken: " + playerTwo.getTricksTaken());
        System.out.println("Player 3: " + playerThree.getName() + "'s tricks taken: " + playerThree.getTricksTaken());
        System.out.println("Player 4: " + playerFour.getName() + "'s tricks taken: " + playerFour.getTricksTaken());

    }


    public static void greeting() {
        System.out.println("Welcome to Game of Hearts!\n This game will need 4 players to play.");

    }

}
