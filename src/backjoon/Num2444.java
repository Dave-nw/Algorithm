package backjoon;

import java.io.IOException;
import java.util.Scanner;

public class Num2444 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = (num - 1) - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num - 1; i > 0; i--) {
            for (int j = num - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
