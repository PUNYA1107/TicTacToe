public class UC6 {
    static char[][] board = new char;

    /**
     * UC6: Place Move on Board
     * Updates the 2D array with the player's symbol.
     * This method assumes validation (UC5) has already passed.
     */
    public static void placeMove(int row, int col, char symbol) {
        // State Update: Assign the symbol to the specific cell
        board[row][col] = symbol;
        
        System.out.println("Board updated: '" + symbol + "' placed at [" + row + "][" + col + "]");
    }

    // Example of how UC5 and UC6 work together in your game loop:
    public static void playTurn(int slot, char symbol) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        // UC5: Validate
        if (isValidMove(row, col)) {
            // UC6: Update State
            placeMove(row, col, symbol);
            // Show the updated board to the user
            displayBoard();
        } else {
            System.out.println("Invalid move, try again!");
        }
    }
}
