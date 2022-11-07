package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(target));
    }

    private static int fibonacci(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }

        return fibonacci(target - 1) + fibonacci(target - 2);
    }
}
