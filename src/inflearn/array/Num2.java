package inflearn.array;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int count = 0;
        int num = 0;
        for (int i = 0; i < size; i++) {
            int h = scanner.nextInt();
            if (num < h) {
                num = h;
                count++;
            }
        }
        System.out.println(count);
    }
}
