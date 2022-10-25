package inflearn.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Num9V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int numberOfDvd = scanner.nextInt();
        int[] songs = new int[size];
        int totalLength = 0;
        for (int i = 0; i < size; i++) {
            songs[i] = scanner.nextInt();
            totalLength += songs[i];
        }
        int averageLength = totalLength / numberOfDvd;
        int[] capacities = new int[totalLength - averageLength + 1];

        for (int i = 0, number = averageLength; i < capacities.length; i++, number++) {
            capacities[i] = number;
        }
        int minCapacity = Integer.MAX_VALUE;
        System.out.println(printMinCapacity(capacities, songs, numberOfDvd, minCapacity));
    }

    private static int printMinCapacity(int[] capacities, int[] songs, int numberOfDvd, int minCapacity) {

        if (capacities.length == 1) {
            if (countOfDvd(songs, capacities[0]) < numberOfDvd) {
                if (capacities[0] < minCapacity) {
                    minCapacity = capacities[0];
                }
            }
            return minCapacity;
        }

        int medium = capacities.length / 2;

        if (countOfDvd(songs, capacities[medium]) < numberOfDvd) {
            if (capacities[medium] < minCapacity) {
                minCapacity = capacities[medium];
            }
            return printMinCapacity(Arrays.copyOfRange(capacities, 0, medium), songs, numberOfDvd, minCapacity);
        } else {
            return printMinCapacity(Arrays.copyOfRange(capacities, medium, capacities.length), songs, numberOfDvd, minCapacity);
        }
    }

    public static int countOfDvd(int[] songs, int capacity) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < songs.length; i++) {
            sum += songs[i];
            if (capacity < sum) {
                count++;
                sum = songs[i];
            }
        }
        return count;
    }
}
