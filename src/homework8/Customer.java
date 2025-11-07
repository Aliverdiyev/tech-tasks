package homework8;

import java.util.Objects;

public class Customer {
    private Integer id;
    private String name;
    private Integer licenseNumber;

    public Customer(Integer id, String name, Integer licenseNumber) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    //   --- Getters ---
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", licenseNumber=" + licenseNumber +
                '}';
    }
}