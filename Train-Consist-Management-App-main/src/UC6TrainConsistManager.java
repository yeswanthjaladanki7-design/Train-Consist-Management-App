import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class UC6TrainConsistManager {
    private Map<String, Integer> bogieCapacityMap;

    public UC6TrainConsistManager() {
        bogieCapacityMap = new HashMap<>();
        initializeDefaultBogies();
    }

    private void initializeDefaultBogies() {
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Rectangular", 50);
        bogieCapacityMap.put("Cylindrical", 40);
    }

    public void addCustomBogie(String type, int capacity) {
        bogieCapacityMap.put(type, capacity);
    }

    public Integer getCapacity(String type) {
        return bogieCapacityMap.getOrDefault(type, 0);
    }

    public void displayInventory() {
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        UC6TrainConsistManager manager = new UC6TrainConsistManager();
        manager.displayInventory();

        System.out.println("\nCapacity of AC Chair: " + manager.getCapacity("AC Chair"));
    }
}