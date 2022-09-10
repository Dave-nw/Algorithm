package inflearn.array;

import java.io.IOException;
import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int criteria = scanner.nextInt();
        System.out.print(criteria);
        for (int i = 0; i < size - 1; i++) {
            int num = scanner.nextInt();
            if (criteria < num) {
                System.out.print(" " + num);
            }
            criteria = num;
        }
    }
}
