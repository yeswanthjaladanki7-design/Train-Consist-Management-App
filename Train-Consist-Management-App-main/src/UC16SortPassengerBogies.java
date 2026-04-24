class PassengerBogie {
    String type;
    int capacity;

    PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " (Capacity: " + capacity + ")";
    }
}

public class UC16SortPassengerBogies {
    public static void main(String[] args) {
        // Initializing an array of Passenger Bogies
        PassengerBogie[] bogies = {
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC Chair Car", 40),
                new PassengerBogie("First Class", 24),
                new PassengerBogie("General", 90)
        };

        System.out.println("Before Sorting:");
        printBogies(bogies);

        // Bubble Sort Algorithm to sort by capacity
        bubbleSort(bogies);

        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        printBogies(bogies);
    }

    public static void bubbleSort(PassengerBogie[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Comparing seating capacities
                if (arr[j].capacity > arr[j + 1].capacity) {
                    // Swap the bogies
                    PassengerBogie temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printBogies(PassengerBogie[] arr) {
        for (PassengerBogie bogie : arr) {
            System.out.println(bogie);
        }
    }
}