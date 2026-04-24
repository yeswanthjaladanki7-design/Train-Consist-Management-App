import java.util.*;

abstract class Bogie {
    String id;
    int capacity;

    Bogie(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie{id='" + id + "', capacity=" + capacity + "}";
    }
}

class PassengerBogie extends Bogie {
    PassengerBogie(String id, int capacity) {
        super(id, capacity);
    }
}

class GoodsBogie extends Bogie {
    GoodsBogie(String id, int capacity) {
        super(id, capacity);
    }
}

class CapacityComparator implements Comparator<Bogie> {
    @Override
    public int compare(Bogie b1, Bogie b2) {
        return Integer.compare(b1.capacity, b2.capacity);
    }
}

public class UC7TrainConsistManager {
    public static void main(String[] args) {
        List<Bogie> train = new ArrayList<>();
        train.add(new PassengerBogie("P1", 72));
        train.add(new GoodsBogie("G1", 100));
        train.add(new PassengerBogie("P2", 50));
        train.add(new GoodsBogie("G2", 120));

        Collections.sort(train, new CapacityComparator());

        for (Bogie b : train) {
            System.out.println(b);
        }
    }
}