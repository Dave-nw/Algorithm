package programmers.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Truck> trucks = new LinkedList<>();
        Queue<Truck> bridge = new LinkedList<>();
        for (int i = 0; i < truck_weights.length; i++) {
            trucks.offer(new Truck(truck_weights[i]));
        }

        int remainingLength = bridge_length;
        int remainingWeight = weight;
        while (!trucks.isEmpty() || !bridge.isEmpty()) {
            answer++;
            int size = bridge.size();
            for (int i = 0; i < size; i++) {
                Truck bridge_truck = bridge.poll();
                if (bridge_truck.getSecond() < bridge_length) {
                    bridge_truck.move();
                    bridge.offer(bridge_truck);
                } else {
                    remainingLength++;
                    remainingWeight += bridge_truck.getWeight();
                }
            }

            Truck truck = trucks.peek();
            if (0 < remainingLength && truck != null) {
                if (truck.getWeight() <= remainingWeight) {
                    truck.move();
                    bridge.offer(trucks.poll());
                    remainingLength--;
                    remainingWeight -= truck.getWeight();
                }
            }
        }
        return answer;
    }
}

class Truck {
    private int weight;
    private int second;

    public Truck(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getSecond() {
        return second;
    }

    public void move() {
        this.second++;
    }
}
