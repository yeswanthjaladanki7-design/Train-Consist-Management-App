import java.util.ArrayList;
import java.util.List;

public class UC20ExceptionHandling {
    private List<String> bogies;

    public UC20ExceptionHandling() {
        this.bogies = new ArrayList<>();
    }

    // Method to add a bogie
    public void addBogie(String bogieType) {
        bogies.add(bogieType);
        System.out.println("Added: " + bogieType);
    }

    // Search logic with Exception Handling
    public void searchBogie(String target) throws EmptyConsistException {
        // Validation: Check if the list is empty before processing
        if (bogies.isEmpty()) {
            throw new EmptyConsistException("Search failed: The train consist is empty. Please add bogies first.");
        }

        boolean found = false;
        for (String bogie : bogies) {
            if (bogie.equalsIgnoreCase(target)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie '" + target + "' found in the consist.");
        } else {
            System.out.println("Bogie '" + target + "' not found.");
        }
    }

    public static void main(String[] args) {
        UC20ExceptionHandling app = new UC20ExceptionHandling();

        // Scenario 1: Search while empty (Triggers Exception)
        try {
            System.out.println("Attempting search on empty train...");
            app.searchBogie("Sleeper");
        } catch (EmptyConsistException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Scenario 2: Search after adding data
        System.out.println("\nInitializing train formation...");
        app.addBogie("Sleeper");
        app.addBogie("AC Chair");

        try {
            app.searchBogie("AC Chair");
        } catch (EmptyConsistException e) {
            System.err.println(e.getMessage());
        }
    }
}