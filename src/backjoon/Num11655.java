package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuffer sb = new StringBuffer();
        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                sb.append(solution(c));
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }

    private static char solution(char c) {
        if ('A' <= c && c <= 'Z') {
            if ('Z' < c + 13) {
                return (char)(c + 13 - 26);
            }

        }

        if ('a' <= c && c <= 'z') {
            if ('z' < c + 13) {
                return (char)(c + 13 - 26);
            }
        }
        return (char)(c + 13);
    }
}
