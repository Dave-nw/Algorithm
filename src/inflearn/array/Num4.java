package inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        fibonacci(size);

    }

    public static void fibonacci(int size) {
        int[] fibonacci = new int[size];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < size; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i : fibonacci) {
            System.out.print(i + " ");
        }

    }
}
