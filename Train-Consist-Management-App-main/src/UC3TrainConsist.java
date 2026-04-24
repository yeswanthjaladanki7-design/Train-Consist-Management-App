import java.util.HashSet;
import java.util.Set;

public class UC3TrainConsist {
    private Set<String> bogieIds;

    public UC3TrainConsist() {
        this.bogieIds = new HashSet<>();
    }

    public boolean addBogie(String bogieId) {
        if (bogieId == null || bogieId.isEmpty()) {
            return false;
        }
        return bogieIds.add(bogieId);
    }

    public void displayBogies() {
        if (bogieIds.isEmpty()) {
            System.out.println("No bogies in the consist.");
            return;
        }
        System.out.println("Train Consist Bogie IDs: " + bogieIds);
    }

    public static void main(String[] args) {
        UC3TrainConsist myTrain = new UC3TrainConsist();

        myTrain.addBogie("BG101");
        myTrain.addBogie("BG102");
        boolean isAdded = myTrain.addBogie("BG101");

        if (!isAdded) {
            System.out.println("Duplicate Bogie ID detected! BG101 was not added again.");
        }

        myTrain.displayBogies();
    }
}