package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] numberOfAlphabet = new int[26];
        for (char c: word.toCharArray()) {
            numberOfAlphabet[c - 97] ++;
        }

        for (int number: numberOfAlphabet) {
            System.out.print(number + " ");
        }
    }
}
