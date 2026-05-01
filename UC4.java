public class UC4 {
    static char[][] board = new char;

    public static void main(String[] args) {
        // Assume UC3 gave us slot 5
        int slot = 5; 
        char currentSymbol = 'X'; 
        
        placeMove(slot, currentSymbol);
        displayBoard();
    }

    /**
     * UC4: Convert Slot Number to Board Index
     * This method maps 1-9 to [row][col] and updates the board.
     */
    public static void placeMove(int slot, char symbol) {
        // Step 1: Adjust to zero-based index (0-8)
        int adjustedSlot = slot - 1;

        // Step 2: Calculate Row and Column
        int row = adjustedSlot / 3;
        int col = adjustedSlot % 3;

        // Step 3: Update the board index
        board[row][col] = symbol;
        
        System.out.println("Placed '" + symbol + "' at row " + row + ", column " + col);
    }

    public static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
