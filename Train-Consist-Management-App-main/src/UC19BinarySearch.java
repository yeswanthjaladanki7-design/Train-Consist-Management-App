import java.util.Arrays;
import java.util.Scanner;

public class UC19BinarySearch {

    /**
     * Performs Binary Search to find the index of a specific Bogie ID.
     * @param bogieIds Sorted array of Bogie IDs
     * @param target The Bogie ID to search for
     * @return The index of the ID if found, otherwise -1
     */
    public static int binarySearch(int[] bogieIds, int target) {
        int left = 0;
        int right = bogieIds.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (bogieIds[mid] == target) {
                return mid;
            }

            // If target is greater, ignore left half
            if (bogieIds[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Target was not found
        return -1;
    }

    public static void main(String[] args) {
        // Sample sorted Bogie IDs (Binary search requires sorted data)
        int[] bogieIds = {101, 205, 310, 412, 550, 670, 890};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        int target = scanner.nextInt();

        int result = binarySearch(bogieIds, target);

        if (result != -1) {
            System.out.println("Bogie ID " + target + " found at index: " + result);
        } else {
            System.out.println("Bogie ID " + target + " not found in the system.");
        }

        scanner.close();
    }
}