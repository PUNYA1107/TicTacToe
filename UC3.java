import java.util.Scanner;

public class UC3 {
    // Existing variables from UC1 & UC2...
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // ... Previous UC1 & UC2 logic ...

        // UC3: Get user input
        if (firstPlayer.equals("User")) {
            int slot = getUserInput();
            System.out.println("You selected slot: " + slot);
        }
    }

    /**
     * UC3: Accept User Slot Input
     * Reads an integer between 1-9 from the console.
     * @return the selected slot number
     */
    public static int getUserInput() {
        System.out.print("Enter a slot (1-9) to place your move: ");
        
        // Basic integer reading
        int slot = sc.nextInt();
        
        // Return the value to the main logic
        return slot;
    }
}