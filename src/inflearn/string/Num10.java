package inflearn.string;

import java.util.Scanner;

public class Num10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] chars = scanner.next().toCharArray();
        char c = scanner.next().charAt(0);
        int[] result = new int[chars.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = result.length;
        }

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == c) {
                    int distance = Math.abs(i - j);
                    if (distance < result[i]) {
                        result[i] = distance;
                    }
                }
            }
        }
        for (int i: result) {
            System.out.print(i +" ");
        }
    }
}


