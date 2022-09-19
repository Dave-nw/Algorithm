package backjoon;

import java.util.Scanner;

public class Num5598 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        for (char c : chars) {
            int number = c - 3;
            if (number < 65) {
                number += 26;
            }
            System.out.print((char) (number));
        }
    }
}
