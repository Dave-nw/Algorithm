package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] words = new String[5];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < words.length; i++) {
            words[i] = br.readLine();
            if (max < words[i].length()) {
                max = words[i].length();
            }
        }

        char[] cArr = new char[max * 5];
        Arrays.fill(cArr, ' ');
        for (int i = 0; i < words.length; i++) {
            int index = i;
            for (int j = 0; j < words[i].length(); j++) {
                cArr[index] = words[i].charAt(j);
                index += 5;
            }
        }

        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] != ' ') {
                System.out.print(cArr[i]);
            }
        }

    }
}
