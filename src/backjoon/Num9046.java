package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cycle = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cycle; i++) {
            int max = Integer.MIN_VALUE;
            int[] alphabets = new int[26];
            String password = br.readLine();
            for (int j = 0; j < password.length(); j++) {
                if (Character.isAlphabetic( password.charAt(j))){
                    int index = password.charAt(j) - 'a';
                    alphabets[index]++;
                    if (max < alphabets[index]) {
                        max = alphabets[index];
                    }
                }
            }

            String result = "";
            for (int j = 0; j < alphabets.length; j++) {
                if (max == alphabets[j]) {
                    if (result.isBlank()) {
                        result = Character.toString(j + 'a');
                    } else {
                        result = "?";
                        break;
                    }
                }
            }
            sb.append(result + "\n");
        }
        System.out.println(sb);
    }
}
