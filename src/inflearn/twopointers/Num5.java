package inflearn.twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int size = number / 2 + 1;
        int[] numArr = new int[size];
        for (int i = 0; i < size; i++) {
            numArr[i] = i + 1;
        }
        int pointer1 = 0;
        int count = 0;
        int sum = 0;
        for (int pointer2 = 0; pointer2 < numArr.length; pointer2++) {
            sum += numArr[pointer2];
            if (sum == number) {
                count++;
            }
            while (number <= sum) {
                sum -= numArr[pointer1];
                pointer1++;
                if (sum == number) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
