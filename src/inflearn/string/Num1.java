package inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toLowerCase();
        char c = br.readLine().toLowerCase().charAt(0);
        int count = 0;

        for (char c2 : str.toCharArray()) {
            if (c == c2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
