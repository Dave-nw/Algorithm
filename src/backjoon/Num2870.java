package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Num2870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        List<BigInteger> numbers = new ArrayList<>();
        for (int cycle = 0; cycle < size; cycle++) {

            char[] chars = br.readLine().toCharArray();

            for (int i = 0; i < chars.length; i++) {
                StringBuffer sb = new StringBuffer();

                while (i < chars.length && Character.isDigit(chars[i])) {
                    sb.append(chars[i]);
                    i++;
                }
                if (!sb.toString().isBlank()) {
                    numbers.add(new BigInteger(sb.toString()));
                }
            }
        }
        Collections.sort(numbers);
        for (BigInteger number: numbers) {
            System.out.println(number);
        }
    }
}
