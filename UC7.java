import java.util.Random;

public class UC7 {
    static char[][] board = new char;
    static char computerSymbol;

    /**
     * UC7: Computer Makes a Random Move
     * Loop until a valid random slot (1-9) is found.
     */
    public static void computerMove() {
        Random rand = new Random();
        int row, col, slot;
        boolean movePlaced = false;

        System.out.println("Computer is thinking...");

        while (!movePlaced) {
            // 1. Generate random slot between 1 and 9
            slot = rand.nextInt(9) + 1; 

            // 2. Convert to indices (UC4 Logic)
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            // 3. Validate Move (UC5 Logic)
            if (isValidMove(row, col)) {
                // 4. Place Move (UC6 Logic)
                placeMove(row, col, computerSymbol);
                System.out.println("Computer chose slot: " + slot);
                movePlaced = true; // Exit the loop
            }
        }
    }
    
    // Note: This relies on your existing isValidMove and placeMove methods.
}
