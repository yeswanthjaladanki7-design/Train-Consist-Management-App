import java.util.ArrayList;
import java.util.List;

// Abstract Bogie class
abstract class Bogie {
    protected String id;

    public Bogie(String id) {
        this.id = id;
    }
}

// PassengerBogie class with seat capacity
class PassengerBogie extends Bogie {
    private int seatCapacity;

    public PassengerBogie(String id, int seatCapacity) {
        super(id);
        this.seatCapacity = seatCapacity;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }
}

// Main class following the UCNUMBER naming convention
public class UC10CountTotalSeats {
    public static void main(String[] args) {
        List<Bogie> trainConsist = new ArrayList<>();

        // Adding various passenger bogies
        trainConsist.add(new PassengerBogie("S1", 72));
        trainConsist.add(new PassengerBogie("S2", 72));
        trainConsist.add(new PassengerBogie("A1", 46));
        trainConsist.add(new PassengerBogie("B1", 64));

        // Using reduce to calculate total seats
        int totalSeats = trainConsist.stream()
                .filter(b -> b instanceof PassengerBogie)
                .map(b -> ((PassengerBogie) b).getSeatCapacity())
                .reduce(0, (sum, capacity) -> sum + capacity);

        System.out.println("Train Consist Management App");
        System.out.println("----------------------------");
        System.out.println("Total Seating Capacity of the Train: " + totalSeats);
    }
}
