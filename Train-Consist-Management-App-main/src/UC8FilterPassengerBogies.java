import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " (Capacity: " + capacity + ")";
    }
}

public class UC8FilterPassengerBogies {
    public static void main(String[] args) {
        // 1. Create a list of bogies 
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 80));

        System.out.println("Original Bogie List: " + bogies);

        // 2. Convert list to stream, 3. Filter, 4. Collect 
        // Requirement: Filter bogies with capacity > 60 
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // 5. Display the filtered bogies 
        System.out.println("Filtered Bogies (Capacity > 60): " + filteredBogies);
    }
}