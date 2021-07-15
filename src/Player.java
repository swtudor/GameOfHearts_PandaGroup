import java.util.Scanner;

public class Player {
   public static void main(String[] args){
       Scanner py = new Scanner(System.in);
       System.out.println("Enter each player's name (click Enter after each name): ");
       String oneName = py.nextLine();
       String twoName = py.nextLine();
       String threeName = py.nextLine();
       String fourName = py.nextLine();

       System.out.println("Player 1: " + oneName);
       System.out.println("Player 2: " + twoName);
       System.out.println("Player 3: " + threeName);
       System.out.println("Player 4: " + fourName);


   }
       
}
