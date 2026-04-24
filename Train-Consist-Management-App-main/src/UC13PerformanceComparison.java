import java.util.*;
import java.util.stream.*;

/**
 * UC13: Performance Comparison (Loops vs Streams)
 * This class measures the execution time of traditional loops versus Java Streams
 * when processing a large list of bogies.
 */
public class UC13PerformanceComparison {

    public static void main(String[] args) {
        // Simulating a large train consist with 100,000 bogies
        List<Double> bogieWeights = new Random().doubles(100_000, 10.0, 50.0)
                .boxed()
                .collect(Collectors.toList());

        // 1. Performance Measurement: Traditional For-Loop
        long startLoop = System.nanoTime();
        double totalWeightLoop = 0;
        for (Double weight : bogieWeights) {
            totalWeightLoop += weight;
        }
        long endLoop = System.nanoTime();

        // 2. Performance Measurement: Java Streams
        long startStream = System.nanoTime();
        double totalWeightStream = bogieWeights.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        long endStream = System.nanoTime();

        // Output Results
        System.out.println("--- Performance Results ---");
        System.out.println("Total Weight (Loop): " + totalWeightLoop);
        System.out.println("Loop Time: " + (endLoop - startLoop) / 1_000_000.0 + " ms");

        System.out.println("\nTotal Weight (Stream): " + totalWeightStream);
        System.out.println("Stream Time: " + (endStream - startStream) / 1_000_000.0 + " ms");
    }
}