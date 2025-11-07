package homework8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class CarRentalSystem {
    private Set<Car> allCars = new HashSet<>();
    private Set<Car> availableCars = new HashSet<>();
    private Map<Customer, Car> activeRentals = new HashMap<>();
    private Map<Car, LocalDateTime> rentalStartTimes = new HashMap<>();
    private Map<Car, LocalDateTime> rentalHistory = new HashMap<>();

    public void addCar(Car car) {
        allCars.add(car);
        availableCars.add(car);
    }

    public void rentCar(Customer customer, Car car) {
        // Əgər avtomobil artıq icarədədirsə (azad deyilsə):
        if (!availableCars.contains(car)) {
            System.out.println("Car is not available!");
        }
        // Əks halda icarəyə verilir
        availableCars.remove(car); // Avtomobil “azad” siyahısından çıxarılır
        activeRentals.put(customer, car);

        LocalDateTime startTime = LocalDateTime.now(); // İcarə vaxtı qeyd edilir
        rentalStartTimes.put(car, startTime);

        System.out.printf("✅ %s rented %s at %s\n", customer.getName(), car.getModel(), startTime);
    }

    public void returnCar(Customer customer) {
        // Müştərinin hansı avtomobili qaytardığını Map-dən tapın:
        Car car = activeRentals.get(customer);
        if (car == null) {
            System.out.println("This customer does not have an active rental.");
        }

        LocalDateTime startTime = rentalStartTimes.get(car);
        LocalDateTime returnTime = LocalDateTime.now(); // Qaytarılma vaxtı

        // Avtomobili “azad” siyahısına geri əlavə edin:
        availableCars.add(car);
        // İcarə tarixçəsinə əlavə edin (son qaytarılma vaxtı)
        rentalHistory.put(car, returnTime);

        // Aktiv icarələrdən və başlama vaxtlarından silin
        activeRentals.remove(customer);
        rentalStartTimes.remove(car);

        // Qaytarılma ilə götürülmə arasında keçən vaxtı hesablayın
        Duration duration = Duration.between(startTime, returnTime);
        long totalHours = duration.toHours();
        long days = duration.toDays();

        // Nümunə çıxışa uyğun nəticə göstərin
        System.out.printf("🚗 %s returned %s after %d days (%d hours total)\n",
                customer.getName(), car.getModel(), days, totalHours);
    }

    public void printActiveRentals() {
        System.out.println("Active Rentals:");
        for (Map.Entry<Customer, Car> entry : activeRentals.entrySet()) {
            Customer customer = entry.getKey();
            Car car = entry.getValue();
            LocalDateTime startTime = rentalStartTimes.get(car);
            // Nümunə çıxışa uyğun format
            System.out.printf("%s -> %s (rented at %s)\n",
                    customer.getName(), car.getModel(), startTime);
        }
    }

// Azad olan avtomobillərin siyahısını göstərir.

    public void printAvailableCars() {
        System.out.println("🟢 Available Cars:"); //
        for (Car car : availableCars) {
            System.out.println(car);
        }
    }

    public void printRentalHistory() {
        System.out.println("Rental History:"); //
        for (Map.Entry<Car, LocalDateTime> entry : rentalHistory.entrySet()) {
            System.out.printf("%s was last returned at %s\n",
                    entry.getKey().getModel(), entry.getValue());
        }
    }
}