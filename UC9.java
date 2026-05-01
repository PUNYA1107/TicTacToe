public class UC9 {
    static char[][] board = new char;

    /**
     * UC9: Check Winning Condition
     * Scans rows, columns, and diagonals for 3-in-a-row.
     * @param s The symbol to check ('X' or 'O')
     * @return true if the symbol has won
     */
    public static boolean isWinner(char s) {
        // 1. Check Rows
        for (int i = 0; i < 3; i++) {
            if (board[i] == s && board[i] == s && board[i] == s) {
                return true;
            }
        }

        // 2. Check Columns
        for (int i = 0; i < 3; i++) {
            if (board[i] == s && board[i] == s && board[i] == s) {
                return true;
            }
        }

        // 3. Check Diagonal (Top-Left to Bottom-Right)
        if (board == s && board == s && board == s) {
            return true;
        }

        // 4. Check Anti-Diagonal (Top-Right to Bottom-Left)
        if (board == s && board == s && board == s) {
            return true;
        }

        return false;
    }
}