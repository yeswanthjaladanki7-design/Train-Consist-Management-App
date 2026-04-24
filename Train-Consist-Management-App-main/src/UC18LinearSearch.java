import java.util.Scanner;

/**
 * UC18: Linear Search for Bogie ID
 * Goal: Search and identify a specific bogie ID from an unsorted list using Linear Search.
 */
public class UC18LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. User provides a list of bogie IDs (Array of bogie IDs) 
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("Available Bogies: [BG101, BG205, BG309, BG412, BG550]");

        // 2. User provides a search key [cite: 1]
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // 3. System traverses the array sequentially and compares elements [cite: 1]
        boolean found = false;
        for (int i = 0; i < bogieIds.length; i++) {
            // 4. Each element is compared with the search key using equals() [cite: 1]
            if (bogieIds[i].equals(searchKey)) {
                // 5. If match found, search stops (Early Termination) [cite: 1]
                found = true;
                break;
            }
        }

        // 6. Result is displayed [cite: 1]
        if (found) {
            System.out.println("Result: Bogie " + searchKey + " found in the consist.");
        } else {
            System.out.println("Result: Bogie " + searchKey + " NOT found in the consist.");
        }

        // 7. Program continues [cite: 1]
        scanner.close();
    }
}