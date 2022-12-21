package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        System.out.println(solution(money));
    }

    private static int solution(int money) {
        int[] coins = new int[]{5, 2};
        int count = money / coins[0];
        int remainder = money % coins[0];
        if (remainder != 0) {
            while (remainder % coins[1] != 0) {
                if (0 < count){
                    count--;
                    remainder += coins[0];
                }else {
                    return -1;
                }
            }
            count += remainder / coins[1];
        }
        return count;
    }
}
