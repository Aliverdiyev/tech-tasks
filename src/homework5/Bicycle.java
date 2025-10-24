package homework5;

public class Bicycle implements Transport {
    private final double ratePerKm;
    private final double speed;

    public Bicycle() {
        this.ratePerKm = 0.05;
        this.speed = 15.0;
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        if (passengers != 1) {
            throw new IllegalArgumentException("The bicycle is for 1 passenger only.");
        }
        return ratePerKm * distance * passengers;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "BICYCLE | ratePerKm = " + ratePerKm + " AZN/km, speed = " + speed + " km/saat";
    }
}