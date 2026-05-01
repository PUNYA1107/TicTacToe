public class UC1 {
    public static void main(String[] args) {
        // Step 1: Create a 3x3 character array
        char[][] board = new char;

        // Step 2: Initialize all cells with '-'
        initializeBoard(board);

        // Step 3: Print the board clearly
        displayBoard(board);
    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void displayBoard(char[][] board) {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Print the character followed by a space for readability
                System.out.print(board[i][j] + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
