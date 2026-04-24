import java.util.ArrayList;

public class UC2TrainConsistApp {
    public static void main(String[] args) {
        ArrayList<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Bogies after insertion: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("Does Sleeper exist? " + passengerBogies.contains("Sleeper"));

        System.out.println("Final list state: " + passengerBogies);
    }
}