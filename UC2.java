import java.util.Random;

public class UC2 {
    // Game State Variables
    static char[][] board = new char;
    static char userSymbol;
    static char computerSymbol;
    static String firstPlayer;

    public static void main(String[] args) {
        // UC1: Initialize and Display Board
        initializeBoard();
        displayBoard();

        // UC2: Perform Toss and Assign Symbols
        performToss();
        
        System.out.println("\n--- Toss Results ---");
        System.out.println("First Player: " + firstPlayer);
        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }

    /**
     * UC2: Toss Logic
     * Uses Random to decide who starts and assigns X to the starter.
     */
    public static void performToss() {
        Random rand = new Random();
        // 0 = User, 1 = Computer
        int toss = rand.nextInt(2);

        if (toss == 0) {
            firstPlayer = "User";
            userSymbol = 'X';
            computerSymbol = 'O';
        } else {
            firstPlayer = "Computer";
            computerSymbol = 'X';
            userSymbol = 'O';
        }
    }

    // --- Supporting UC1 Methods ---
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
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
