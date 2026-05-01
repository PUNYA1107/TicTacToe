public class UC8 {
    static String currentPlayer; // From UC2
    static boolean isGameOver = false;

    public static void playGame() {
        // Assume UC1 (Init) and UC2 (Toss) have already run
        
        while (!isGameOver) {
            displayBoard();
            System.out.println("\nIt is " + currentPlayer + "'s turn.");

            if (currentPlayer.equals("User")) {
                int slot = getUserInput(); // UC3
                int row = (slot - 1) / 3;  // UC4
                int col = (slot - 1) % 3;

                if (isValidMove(row, col)) { // UC5
                    placeMove(row, col, userSymbol); // UC6
                    checkGameState(); // Logic to check Win/Draw
                    currentPlayer = "Computer"; // Switch Turn
                }
            } else {
                // Computer's Turn
                computerMove(); // UC7 (Contains its own validation/placement)
                checkGameState(); // Logic to check Win/Draw
                currentPlayer = "User"; // Switch Turn
            }
        }
    }

    public static void checkGameState() {
        if (isWinner()) {
            displayBoard();
            System.out.println("Congratulations! " + currentPlayer + " wins!");
            isGameOver = true;
        } else if (isBoardFull()) {
            displayBoard();
            System.out.println("It's a draw!");
            isGameOver = true;
        }
    }
}
