package inflearn.stack;


import java.util.*;

public class Num8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int target = scanner.nextInt();

        Queue<Integer> waitingLine = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Integer[] degreeOfRisk = new Integer[size];

        for (int index = 0; index < size; index++) {
            int risk = scanner.nextInt();
            waitingLine.offer(index);
            map.put(index, risk);
            degreeOfRisk[index] = risk;
        }
        Arrays.sort(degreeOfRisk, Comparator.reverseOrder());

        int count = 0;
        for (int i = 0; i < degreeOfRisk.length; i++) {
            int index = waitingLine.poll();
            while (map.get(index) != degreeOfRisk[i]) {
                waitingLine.offer(index);
                index = waitingLine.poll();
            }
            count++;
            if (index == target) {
                break;
            }
        }
        System.out.println(count);
    }
}
