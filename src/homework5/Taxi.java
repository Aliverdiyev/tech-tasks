package homework5;

public class Taxi implements Transport {
    private final double ratePerKm;
    private final double speed;

    public Taxi() {
        this.ratePerKm = 1.0;
        this.speed = 50.0;
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        if (passengers > 3) {
            throw new IllegalArgumentException("The taxi is for 3 passengers.");
        }
        return ratePerKm * distance * passengers;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "TAXI | min = 3.0 AZN, ratePerKm = " + ratePerKm + " AZN/km, speed = " + speed + " km/saat";
    }
}
