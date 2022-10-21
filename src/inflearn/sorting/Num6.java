package inflearn.sorting;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Num6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] students = new int[size];
        for (int i = 0; i < size; i++) {
            students[i] = scanner.nextInt();
        }
        int[] sortedStudents = Arrays.copyOf(students, size);
        Arrays.sort(sortedStudents);

        for (int i = 0; i < size; i++) {
            if (students[i] != sortedStudents[i]) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}
