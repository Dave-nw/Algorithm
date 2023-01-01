package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < size; i++) {
            int[] alphabets = new int[26];
            String word = br.readLine();
            char currentChar = ' ';
            int index = 0;
            for (; index < word.length(); index++) {
                char c = word.charAt(index);
                if (c != currentChar) {
                    if (alphabets[c - 'a'] == 1) {
                        break;
                    } else {
                        alphabets[c - 'a'] = 1;
                        currentChar = c;
                    }
                }
            }
            if (index == word.length()){
                count++;
            }
        }
        System.out.println(count);
    }
}
