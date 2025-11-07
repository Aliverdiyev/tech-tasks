package homework8;

import java.util.Objects;

public class Car {
    private Integer id;
    private String brand;
    private String model;
    private Integer year;

    public Car(Integer id, String brand, String model, Integer year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // --- Getters ---
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}