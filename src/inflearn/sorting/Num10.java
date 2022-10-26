package inflearn.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Num10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int numberOfHorses = scanner.nextInt();
        int[] positions = new int[size];
        for (int i = 0; i < size; i++) {
            positions[i] = scanner.nextInt();
        }
        Arrays.sort(positions);

        int maxP = Arrays.stream(positions).max().getAsInt();
        int minP = Arrays.stream(positions).min().getAsInt();
        int[] distance = new int[maxP - minP];
        for (int i = 0; i < distance.length; i++) {
            distance[i] = i + 1;
        }
        System.out.println(searchMaxDistance(positions, distance, numberOfHorses));
    }

    private static int searchMaxDistance(int[] positions, int[] distance, int numberOfHorses) {
        int maxDistance = Integer.MIN_VALUE;
        maxDistance = binarySearch(positions, distance, numberOfHorses, maxDistance);
        return maxDistance;
    }

    private static int binarySearch(int[] positions, int[] distance, int numberOfHorses, int maxDistance) {
        if (distance.length == 1) {
            if (isPossibleStable(positions, distance[0], numberOfHorses) && maxDistance < distance[0]) {
                maxDistance = distance[0];
            }
            return maxDistance;
        }

        int medium = distance.length / 2;

        if (isPossibleStable(positions, distance[medium], numberOfHorses)) {
            if (maxDistance < distance[medium]) {
                maxDistance = distance[medium];
            }
            return searchMaxDistance(positions, Arrays.copyOfRange(distance, medium, distance.length), numberOfHorses);
        } else {
            return searchMaxDistance(positions, Arrays.copyOfRange(distance, 0, medium), numberOfHorses);
        }
    }

    private static boolean isPossibleStable(int[] positions, int distance, int numberOfHorses) {
        int count = 1;
        int ep = positions[0];
        for (int i = 1; i < positions.length; i++) {
            if (distance <= (positions[i] - ep)) {
                count++;
                ep = positions[i];
            }
        }
        if (numberOfHorses <=count) {
            return true;
        }
        return false;
    }
}
