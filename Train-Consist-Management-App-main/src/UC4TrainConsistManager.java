import java.util.TreeSet;
import java.util.SortedSet;

public class UC4TrainConsistManager {
    private SortedSet<String> bogieIds;

    public UC4TrainConsistManager() {
        this.bogieIds = new TreeSet<>();
    }

    public boolean addBogie(String bogieId) {
        return bogieIds.add(bogieId);
    }

    public void displayBogieSequence() {
        for (String id : bogieIds) {
            System.out.println(id);
        }
    }

    public String getFirstBogie() {
        return bogieIds.isEmpty() ? null : bogieIds.first();
    }

    public String getLastBogie() {
        return bogieIds.isEmpty() ? null : bogieIds.last();
    }

    public SortedSet<String> getBogieRange(String fromId, String toId) {
        return bogieIds.subSet(fromId, toId);
    }

    public static void main(String[] args) {
        UC4TrainConsistManager manager = new UC4TrainConsistManager();

        manager.addBogie("LOCO-001");
        manager.addBogie("PASS-102");
        manager.addBogie("CARG-205");
        manager.addBogie("PASS-101");

        manager.displayBogieSequence();
    }
}