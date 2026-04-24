import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class UC12SafetyCheck {
    public static void main(String[] args) {
        // 1. Prepare a list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // 2. Convert list to stream and check safety rules
        // Rule: Cylindrical bogies must only carry Petroleum
        boolean isSafe = bogies.stream().allMatch(bogie -> {
            if (bogie.type.equals("Cylindrical")) {
                return bogie.cargo.equals("Petroleum");
            }
            return true; // Other bogies are safe by default in this UC [cite: 1]
        });

        // 3. Display the result [cite: 1]
        if (isSafe) {
            System.out.println("Train is safety compliant.");
        } else {
            System.out.println("Safety Alert: Unsafe cargo detected!");
        }
    }
}
