import java.util.Arrays;
import java.util.Scanner;

/**
 * UC17: Sort Bogie Names Using Arrays.sort()
 * This class demonstrates sorting an array of bogie names alphabetically
 * using the built-in Java Arrays utility class.
 */
public class UC17SortBogieNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the number of bogies in the train consist
        System.out.print("Enter the number of bogies in the train: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] bogieNames = new String[n];

        // 2. Input bogie names (e.g., Sleeper, AC Chair, Goods-Rectangular)
        System.out.println("Enter the names of the " + n + " bogies:");
        for (int i = 0; i < n; i++) {
            System.out.print("Bogie " + (i + 1) + ": ");
            bogieNames[i] = scanner.nextLine();
        }

        // 3. Sorting using Arrays.sort()
        // This replaces the UC16 manual Bubble Sort approach
        Arrays.sort(bogieNames);

        // 4. Display the sorted train consist
        System.out.println("\n--- Sorted Train Consist (Alphabetical) ---");
        for (String name : bogieNames) {
            System.out.println("- " + name);
        }

        scanner.close();
    }
}