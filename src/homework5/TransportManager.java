package homework5;

import java.util.Random;
import java.util.Scanner;

public class TransportManager {
    public static Transport getTransport(TransportType type) {
        return switch (type) {
            case BUS -> new Bus();
            case TAXI -> new Taxi();
            case BICYCLE -> new Bicycle();
            case SCOOTER -> new Scooter();
        };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select the type of transportation you want to use: ");
        System.out.println("1 - Bus | 2 - Taxi | 3 - Bicycle | 4 - Scooter");
        int choice = input.nextInt();

        if (choice < 1 || choice > 4) {
            throw new IllegalArgumentException("Invalid choice! Please select 1, 2, 3, or 4.");
        }

        System.out.println("Enter the number of passengers you want to use: ");
        int passengers = input.nextInt();
        input.close();

        Random randomDistance = new Random();
        double distance = randomDistance.nextDouble(1, 100);

        switch (choice) {
            case 1 -> {
                Transport transportBus = getTransport(TransportType.BUS);
                printDetails(passengers, distance, transportBus);
            }
            case 2 -> {
                Transport transportTaxi = getTransport(TransportType.TAXI);
                printDetails(passengers, distance, transportTaxi);
            }
            case 3 -> {
                Transport transportBicycle = getTransport(TransportType.BICYCLE);
                printDetails(passengers, distance, transportBicycle);
            }
            case 4 -> {
                Transport transportScooter = getTransport(TransportType.SCOOTER);
                printDetails(passengers, distance, transportScooter);
            }
        }
    }

    private static void printDetails(int passengers, double distance, Transport transportBicycle) {
        System.out.println("Transport Info: " + transportBicycle.getTransportInfo());
        System.out.println("Distance: " + String.format("%.2f", distance) + " km");
        System.out.println("Fare for " + passengers + " passenger(s): " +
                String.format("%.2f", transportBicycle.calculateFare(distance, passengers)) + " AZN");
        System.out.println("Estimated time: " +
                String.format("%.2f", transportBicycle.calculateTime(distance)) + " hours");
    }
}