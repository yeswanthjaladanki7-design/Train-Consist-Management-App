import java.util.ArrayList;
import java.util.List;

// Custom Exception for Safety Violations
class SafetyViolationException extends Exception {
    public SafetyViolationException(String message) {
        super(message);
    }
}

// Bogle class representing a Goods Bogie
class GoodsBogie {
    private String type; // e.g., "Rectangular", "Cylindrical"
    private String assignedCargo = null;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) throws SafetyViolationException {
        // Example Safety Policy: Cylindrical bogies cannot carry "Explosive" cargo
        if (this.type.equals("Cylindrical") && cargo.equalsIgnoreCase("Explosive")) {
            throw new SafetyViolationException("Safety Violation: Cylindrical bogies cannot carry Explosive cargo!");
        }
        this.assignedCargo = cargo;
        System.out.println("Cargo '" + cargo + "' successfully assigned to " + type + " bogie.");
    }

    public void reset() {
        this.assignedCargo = null;
        System.out.println("Bogie status cleared.");
    }
}

/**
 * UC15SafeCargoAssignment
 * Demonstrates safe cargo assignment using try-catch-finally.
 */
public class UC15SafeCargoAssignment {
    public static void main(String[] args) {
        GoodsBogie myBogie = new GoodsBogie("Cylindrical");
        String cargoToLoad = "Explosive";

        System.out.println("--- Starting Cargo Assignment Sequence ---");

        try {
            // Attempting a dynamic assignment that might violate safety policies
            myBogie.assignCargo(cargoToLoad);
        } catch (SafetyViolationException e) {
            // Handling the runtime safety violation
            System.err.println("ALERT: Assignment failed. Reason: " + e.getMessage());
        } finally {
            // Ensuring the system remains in a known state regardless of failure
            myBogie.reset();
            System.out.println("--- Assignment Sequence Finalized ---");
        }
    }
}