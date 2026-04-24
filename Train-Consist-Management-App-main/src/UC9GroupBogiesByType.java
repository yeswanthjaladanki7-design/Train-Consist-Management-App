import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bogie{name='" + name + "', capacity=" + capacity + "}";
    }
}

public class UC9GroupBogiesByType {
    public static void main(String[] args) {
        // 1. User creates a list of bogies 
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 40),
                new Bogie("Sleeper", 72),
                new Bogie("First Class", 24),
                new Bogie("AC Chair", 40)
        );

        System.out.println("Original Bogie List:");
        bogies.forEach(System.out::println);

        // 2. System converts the list into a stream 
        // 3. groupingBy() collector is applied 
        // 4. Bogies are grouped into a Map<String, List<Bogie>> [cite: 1]
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        // 5. Grouped result is displayed [cite: 1]
        System.out.println("\nGrouped Bogies by Type:");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + ": " + list);
        });
    }
}