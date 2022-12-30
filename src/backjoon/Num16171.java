package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num16171 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String target = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c= word.charAt(i);
            if (Character.isAlphabetic(c)){
                sb.append(c);
            }
        }

        int result = 0;
        word = sb.toString();
        for (int i = 0; i < word.length(); i++) {
            if (word.startsWith(target,i)){
                result = 1;
                break;
            }
        }
        System.out.println(result);
    }
}
