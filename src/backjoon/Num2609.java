package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int number1 = Integer.parseInt(st.nextToken());
        int number2 = Integer.parseInt(st.nextToken());

        int gcd = euclideanAlgorithm(Math.max(number1, number2), Math.min(number1, number2));
        int lcm = number1 * number2 / gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }

    private static int euclideanAlgorithm(int number1, int number2) {
        if (number1 % number2 == 0) {
            return number2;
        } else {
            return euclideanAlgorithm(number2, number1 % number2);
        }
    }
}
