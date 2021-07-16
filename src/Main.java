import java.util.Scanner;

public class Main {
    public static void main(String[] args){

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

        System.out.println("Player 1: " + playerOne.getName());
        System.out.println("Player 2: " + playerTwo.getName());
        System.out.println("Player 3: " + playerThree.getName());
        System.out.println("Player 4: " + playerFour.getName());

    }

    public void greeting(){
        System.out.println("Welcome to Game of Hearts!\n This game will need 4 player to play.");

    }

}
