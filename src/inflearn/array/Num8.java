package inflearn.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Num8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numArr = new int[size];
        List<Integer> sortedNumbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int number = scanner.nextInt();
            numArr[i] = number;
            sortedNumbers.add(number);
        }
        sortedNumbers.sort(Comparator.reverseOrder());

        for (int i = 0; i < size; i++) {
            System.out.print(sortedNumbers.indexOf(numArr[i]) + 1 + " ");
        }
    }
}
