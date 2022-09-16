package inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        System.out.println(solution(size));
    }

    private static int solution(int size) {
        int[] numArr = new int[size + 1];
        int count = 0;
        numArr[0] = 0;
        numArr[1] = 0;
        for (int i = 2; i < numArr.length; i++) {
            numArr[i] = i;
        }

        for (int i = 2; i < numArr.length; i++) {
            if (isPrimeNumber(numArr[i])) {
                count++;
                for (int j = 2; j * i < numArr.length; j++) {
                    numArr[i * j] = 0;
                }
            }
        }
        return count;
    }

    public static boolean isPrimeNumber(int number) {
        if (number == 0) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
