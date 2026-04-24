public class UseCase1TrainConsistMgmnt {
    public static void main(String[] args) {
        String trainName = "Express 101";
        String engineType = "Electric";
        int passengerBogies = 5;
        int goodsBogies = 2;

        System.out.println("Train Consist Summary");
        System.out.println("---------------------");
        System.out.println("Train Name: " + trainName);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Number of Passenger Bogies: " + passengerBogies);
        System.out.println("Number of Goods Bogies: " + goodsBogies);
        System.out.println("Total Bogies: " + (passengerBogies + goodsBogies));
    }
}
