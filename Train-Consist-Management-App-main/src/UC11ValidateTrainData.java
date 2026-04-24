import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * UC11: Validate Train ID & Cargo Codes (Regex)
 * This class provides utility methods to validate train-related strings
 * using regular expressions to ensure data integrity.
 */
public class UC11ValidateTrainData {

    // Regex for Train ID: Starts with 'TRN', followed by 4 digits (e.g., TRN1234)
    private static final String TRAIN_ID_REGEX = "^TRN\\d{4}$";

    // Regex for Cargo Code: 2 uppercase letters followed by a hyphen and 3 digits (e.g., CR-505)
    private static final String CARGO_CODE_REGEX = "^[A-Z]{2}-\\d{3}$";

    /**
     * Validates if the provided Train ID matches the required format.
     * @param trainId The ID string to validate.
     * @return true if valid, false otherwise.
     */
    public static boolean isValidTrainId(String trainId) {
        if (trainId == null) return false;
        return Pattern.matches(TRAIN_ID_REGEX, trainId);
    }

    /**
     * Validates if the provided Cargo Code matches the required format.
     * @param cargoCode The code string to validate.
     * @return true if valid, false otherwise.
     */
    public static boolean isValidCargoCode(String cargoCode) {
        if (cargoCode == null) return false;
        return Pattern.matches(CARGO_CODE_REGEX, cargoCode);
    }

    public static void main(String[] args) {
        // Test Cases
        String[] testTrainIds = {"TRN1234", "trn1234", "TRN123", "TRN12345", "ABC1234"};
        String[] testCargoCodes = {"CR-505", "cr-505", "C-505", "CR505", "AB-123"};

        System.out.println("--- Train ID Validation ---");
        for (String id : testTrainIds) {
            System.out.println(id + " : " + (isValidTrainId(id) ? "VALID" : "INVALID"));
        }

        System.out.println("\n--- Cargo Code Validation ---");
        for (String code : testCargoCodes) {
            System.out.println(code + " : " + (isValidCargoCode(code) ? "VALID" : "INVALID"));
        }
    }
}