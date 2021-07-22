public class Board {

    public void printBoard() {
        char[][] gameBoard = {
                {' ', '-', '-', ' '},
                {'|', ' ', ' ', '|'},
                {' ', '-', '-', ' '}


        };


        // each player card corresponds to a specific number for each card. using a switch statement.
        public static void printboardGame() {
            for (char[] row : gameBoard) { // row
                for (char col : row) { //column
                    System.out.print(col);
                }
                System.out.println();
            }
        }
    }
}

