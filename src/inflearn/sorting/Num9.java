package inflearn.sorting;

import java.util.Scanner;

public class Num9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int numberOfDvd = scanner.nextInt();
        int[] songs = new int[size];
        int length = 0;
        for (int i = 0; i < size; i++) {
            songs[i] = scanner.nextInt();
            length += songs[i];
        }
        int averageLength = length / numberOfDvd;
        int minCapacity = averageLength;

        boolean isDone = false;
        while (!isDone) {
            int sum = 0;
            int count = 0;
            for (int i = 0; i < size; i++) {
                sum += songs[i];
                if (minCapacity < sum) {
                    count ++;
                    sum = songs[i];
                }
            }
            if (count < numberOfDvd) {
                isDone = true;
            } else {
                minCapacity ++;
            }
        }
        System.out.println(minCapacity);
    }
}
