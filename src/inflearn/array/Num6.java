package inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] numStrArr = br.readLine().split(" ");

        for (int i = 0; i < size; i++) {
            int number = Integer.parseInt(new StringBuffer(numStrArr[i]).reverse().toString());
            if (isPrimeNumber(number)) {
                System.out.print(number + " ");
            }
        }

    }

    private static boolean isPrimeNumber(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
