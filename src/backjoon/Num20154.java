package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num20154 {
    final static int[] ALPHABETS = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
    final static String VICTORY = "I'm a winner!";
    final static String DEFEAT = "You're the winner?";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            result += ALPHABETS[word.charAt(i) - 'A'];
        }

        result %= 10;
        System.out.println(result == 0 || result % 2 == 0 ? DEFEAT : VICTORY);
    }
}
