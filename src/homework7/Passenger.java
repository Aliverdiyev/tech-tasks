package homework7;

import java.util.Objects;

public class Passenger {
    private final String name;
    private final boolean isPriority;

    public Passenger(String name, boolean isPriority) {
        this.name = name;
        this.isPriority = isPriority;
    }

    public String getName() {
        return name;
    }

    public boolean isPriority() {
        return isPriority;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name = '" + name + '\'' +
                ", isPriority = " + (isPriority ? "Yes" : "No") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return isPriority == passenger.isPriority && Objects.equals(name, passenger.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isPriority);
    }
}