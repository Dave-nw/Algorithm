package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        Fibo[] fibo = new Fibo[41];
        fibo[0] = new Fibo(1, 0);
        fibo[1] = new Fibo(0, 1);
        for (int i = 0; i < size; i++) {
            int number = Integer.parseInt(br.readLine());
            if (fibo[number] == null) {
                for (int j = 2; j <= number; j++) {
                    if (fibo[j] == null) {
                        int zero = fibo[j - 2].zero + fibo[j - 1].zero;
                        int one = fibo[j - 2].one + fibo[j - 1].one;
                        fibo[j] = new Fibo(zero, one);
                    }
                }
            }
            System.out.println(fibo[number].zero + " " + fibo[number].one);
        }
    }
}

class Fibo {
    public int zero = 0;
    public int one = 0;

    public Fibo(int zero, int one) {
        this.zero = zero;
        this.one = one;
    }
}
