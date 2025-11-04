package homework7;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class Bus {
    private final Deque<Passenger> passengers = new LinkedList<>();
    private final int CAPACITY = 5;

    public boolean isFull() {
        return passengers.size() >= CAPACITY;
    }

    public boolean isEmpty() {
        return passengers.isEmpty();
    }

    public int size() {
        return passengers.size();
    }

    public void board(Passenger p) {
        if (!isFull()) passengers.addLast(p); // board at the end
    }

    public void dropRandom(Random random) {
        if (isEmpty()) return;
        int toDrop = 1 + random.nextInt(2); // 1 or 2
        toDrop = Math.min(toDrop, size());
        for (int i = 0; i < toDrop; i++) {
            int index = random.nextInt(size());
            int cur = 0;
            Passenger removed = null;
            LinkedList<Passenger> temp = new LinkedList<>(passengers);
            removed = temp.remove(index);
            passengers.clear();
            passengers.addAll(temp);
            if (removed != null) {
                System.out.println(removed + " left the bus.");
            }
        }
    }

    public LinkedList<Passenger> currentPassengers() {
        return new LinkedList<>(passengers);
    }

    @Override
    public String toString() {
        return currentPassengers().toString();
    }
}