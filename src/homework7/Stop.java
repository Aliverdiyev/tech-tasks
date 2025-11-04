package homework7;

import java.util.LinkedList;
import java.util.Queue;

public class Stop {
    private final Queue<Passenger> priorityQueue = new LinkedList<>();
    private final Queue<Passenger> regularQueue = new LinkedList<>();
    private final int MAX_WAIT = 10;

    public void addPassenger(Passenger p) {
        if (size() >= MAX_WAIT) return; // ignore extras if full
        if (p.isPriority()) priorityQueue.offer(p);
        else regularQueue.offer(p);
    }

    // total waiting
    public int size() {
        return priorityQueue.size() + regularQueue.size();
    }

    public boolean hasPriority() {
        return !priorityQueue.isEmpty();
    }

    public Passenger pollNext() {
        if (!priorityQueue.isEmpty()) return priorityQueue.poll();
        return regularQueue.poll();
    }

    public LinkedList<Passenger> remainingList() {
        LinkedList<Passenger> list = new LinkedList<>();
        list.addAll(priorityQueue);
        list.addAll(regularQueue);
        return list;
    }
}