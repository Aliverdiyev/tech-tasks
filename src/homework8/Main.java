package homework8;

public class Main {
    public static void main(String[] args) {
        CarRentalSystem system = new CarRentalSystem();

        // Avtomobilləri yarat və sistemə əlavə et:
        Car car1 = (new Car(1, "Toyota", "Corolla", 2020));
        Car car2 = (new Car(2, "Honda", "Civic", 2021));
        Car car3 = (new Car(3, "Ford", "Focus", 2019));
        Car car4 = (new Car(4, "BMW", "3 Series", 2022));
        Car car5 = (new Car(5, "Audi", "A4", 2023));
        Car car6 = (new Car(6, "Mercedes", "C-Class", 2021));
        Car car7 = (new Car(7, "Kia", "K5", 2020));
        Car car8 = (new Car(8, "Hyundai", "Elantra", 2022));
        Car car9 = (new Car(9, "Volkswagen", "Golf", 2020));
        Car car10 = (new Car(10, "Nissan", "Altima", 2019));
        system.addCar(car1);
        system.addCar(car2);
        system.addCar(car3);
        system.addCar(car4);
        system.addCar(car5);
        system.addCar(car6);
        system.addCar(car7);
        system.addCar(car8);
        system.addCar(car9);
        system.addCar(car10);

        // Müştəriləri yarat
        Customer customer1 = new Customer(1, "Alice Johnson", 12567);
        Customer customer2 = new Customer(2, "Brian Smith", 23891);
        Customer customer3 = new Customer(3, "Carla Mendes", 33211);
        Customer customer4 = new Customer(4, "Daniel Young", 44822);
        Customer customer5 = new Customer(5, "Ella Brown", 55673);
//        Customer customer6 = new Customer(6, "Frank Adams", 66754);
//        Customer customer7 = new Customer(7, "Grace Lee", 77865);//
//        Customer customer8 = new Customer(8, "Henry Clark", 88942);
//        Customer customer9 = new Customer(9, "Isabella Garcia", 99018);
//        Customer customer10 = new Customer(10, "Jack Wilson", 11034);
        system.rentCar(customer1, car1);
        system.rentCar(customer2, car2);
        system.rentCar(customer3, car3);
        system.rentCar(customer4, car4);
        system.rentCar(customer5, car5);

        system.returnCar(customer1);
        system.returnCar(customer2);
        system.returnCar(customer3);
        system.returnCar(customer4);
        system.returnCar(customer5);


        system.printAvailableCars();
        system.printActiveRentals();
        system.printRentalHistory();
        system.printAvailableCars();
    }
}