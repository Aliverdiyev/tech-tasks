package homework5;

public class Bus implements Transport {
    private final double ratePerKm;
    private final double speed;

    public Bus() {
        this.ratePerKm = 0.25;
        this.speed = 35.0;
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        if (passengers > 40) {
            throw new IllegalArgumentException("The bus is for 40 passengers.");
        }
        return ratePerKm * distance * passengers;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "BUS | ratePerKm = " + ratePerKm + " AZN/km, speed = " + speed + " km/saat";
    }
}
