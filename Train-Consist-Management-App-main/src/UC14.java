// Custom Exception for UC14
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Logic for Passenger Bogies
class PassengerBogie {
    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        // Validation rule: Capacity cannot be zero or negative
        if (capacity <= 0) {
            throw new InvalidCapacityException("Invalid Capacity Error: [" + capacity +
                    "]. Seat capacity must be a positive integer.");
        }
        this.type = type;
        this.capacity = capacity;
        System.out.println("Successfully added " + type + " bogie (Capacity: " + capacity + ")");
    }
}

// Main Class named UC14 as requested
public class UC14 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management System: UC14 Validation ===");

        // Test Scenario 1: Valid Data
        try {
            System.out.println("\nScenario 1: Creating Valid Bogie...");
            new PassengerBogie("Sleeper", 72);
        } catch (InvalidCapacityException e) {
            System.err.println(e.getMessage());
        }

        // Test Scenario 2: Zero Capacity
        try {
            System.out.println("\nScenario 2: Creating Bogie with 0 Capacity...");
            new PassengerBogie("AC Chair Car", 0);
        } catch (InvalidCapacityException e) {
            System.err.println("Caught Expected Exception: " + e.getMessage());
        }

        // Test Scenario 3: Negative Capacity
        try {
            System.out.println("\nScenario 3: Creating Bogie with Negative Capacity...");
            new PassengerBogie("First Class", -12);
        } catch (InvalidCapacityException e) {
            System.err.println("Caught Expected Exception: " + e.getMessage());
        }

        System.out.println("\n=== Validation Test Complete ===");
    }
}