public class UC5 {
    static char[][] board = new char;

    /**
     * UC5: Validate User Move
     * Checks if the indices are within bounds and the cell is empty.
     * @return true if move is valid, false otherwise
     */
    public static boolean isValidMove(int row, int col) {
        // 1. Boundary Checking (0-2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Error: Move out of bounds!");
            return false;
        }

        // 2. Cell Empty Check
        if (board[row][col] != '-') {
            System.out.println("Error: Cell already occupied! Try again.");
            return false;
        }

        // If both checks pass
        return true;
    }

    // Integration Example
    public static void processTurn(int slot, char symbol) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        if (isValidMove(row, col)) {
            board[row][col] = symbol;
            System.out.println("Move accepted!");
        } else {
            // In a real game loop, you'd prompt the user to enter a new slot here
            System.out.println("Move rejected. Please choose an empty slot (1-9).");
        }
    }
}
