package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num == 0) {
            System.out.println(1);
        }else {
            for (int i = num - 1; 1 < i ; i--) {
                num *= i;
            }
            System.out.println(num);
        }

    }
}
