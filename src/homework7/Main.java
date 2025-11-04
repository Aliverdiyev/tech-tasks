package homework7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Stop stop1 = new Stop();
        Stop stop2 = new Stop();
        Stop stop3 = new Stop();
        Random random = new Random();

        // Stop 1
        stop1.addPassenger(new Passenger("Aysel", true));
        stop1.addPassenger(new Passenger("Rauf", false));
        stop1.addPassenger(new Passenger("Ali", false));

        // Stop 2
        stop2.addPassenger(new Passenger("Nigar", true));
        stop2.addPassenger(new Passenger("Samir", true));
        stop2.addPassenger(new Passenger("Murad", false));

        // Stop 3
        stop3.addPassenger(new Passenger("Sevinc", true));
        stop3.addPassenger(new Passenger("Leyla", false));
        stop3.addPassenger(new Passenger("Tural", false));

        Stop[] stops = new Stop[]{stop1, stop2, stop3};

        for (int i = 0; i < stops.length; i++) {
            System.out.println();
            System.out.println("Stop " + (i + 1) + " reached.");
            // 1) Some passengers leave
            bus.dropRandom(random);

            Stop cur = stops[i];
            while (!bus.isFull() && cur.size() > 0) {
                Passenger next = cur.pollNext();
                if (next == null) break;
                bus.board(next);
                System.out.println(next + " boarded the bus.");
            }

            System.out.println("Bus now: " + bus);
            System.out.println("Stop " + (i + 1) + " remaining: " + cur.remainingList());
        }

        System.out.println();
        System.out.println("Final passengers in bus: " + bus);
    }
}