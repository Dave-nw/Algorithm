package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        String result = makePalindrome(name);
        if (result.isBlank()) {
            System.out.println("I'm Sorry Hansoo");
        }else {
            System.out.println(result);
        }
    }

    private static String makePalindrome(String name) {
        StringBuffer sb = new StringBuffer();
        StringBuffer result;
        int[] alphabets = creatAlphabetArr(name);

        if (name.length() % 2 == 0) {
            for (int i = 0; i < alphabets.length; i++) {
                if (0 < alphabets[i] && alphabets[i] % 2 !=0) {
                    return "";
                }
            }
            result = getString(sb, alphabets);
        }else {
            boolean flag = false;
            char middle = ' ';
            for (int i = 0; i < alphabets.length; i++) {
                if (0 < alphabets[i] && alphabets[i] % 2 !=0) {
                    if (flag) {
                        return "";
                    }
                    middle = (char)(i+'A');
                    alphabets[i] --;
                    flag = true;
                }
            }
            if (middle == ' ') {
                return "";
            }

            result = getString(sb, alphabets);
            result.append(middle);
        }
        result.append(sb.reverse());
        return result.toString();
    }

    private static StringBuffer getString(StringBuffer sb, int[] alphabets) {
        for (int i = 0; i < alphabets.length; i++) {
            if (0 < alphabets[i]) {
                for (int j = 0; j < alphabets[i]/2; j++) {
                    sb.append((char)(i+'A'));
                }
            }
        }
        return new StringBuffer(sb);
    }

    private static int[] creatAlphabetArr(String name) {
        int[] alphabets = new int[26];
        for (char c: name.toCharArray()) {
            int index = c -'A';
            alphabets[index] ++;
        }
        return alphabets;
    }
}
