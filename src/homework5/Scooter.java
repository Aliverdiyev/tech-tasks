package homework5;

public class Scooter implements Transport {
    private final double ratePerKm;
    private final double speed;

    public Scooter() {
        this.ratePerKm = 0.12;
        this.speed = 20.0;
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        if (passengers != 1) {
            throw new IllegalArgumentException("The scooter is for 1 passenger only.");
        }
        return ratePerKm * distance * passengers;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "SCOOTER | open = 1.0 AZN, ratePerKm = " + ratePerKm + " AZN/km, speed = " + speed + " km/saat";
    }
}