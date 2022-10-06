package inflearn.hash;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int num = scanner.nextInt();

        int[] numArr = new int[size];
        for (int i = 0; i < size; i++) {
            numArr[i] = scanner.nextInt();
        }

        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        int sum = 0;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    sum = numArr[i] + numArr[j] + numArr[k];
                    set.add(sum);
                }
            }
        }

        int count = 0;
        for (int i: set) {
            count ++;
            if (count == num){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
