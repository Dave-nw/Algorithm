package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();
        String[] polyominos = {"AAAA", "BB"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length(); i++) {
            if (board.charAt(i) == 'X') {
                if (board.startsWith("XXXX", i)) {
                    sb.append(polyominos[0]);
                    i += 3;
                } else if (board.startsWith("XX", i)) {
                    sb.append(polyominos[1]);
                    i += 1;
                } else {
                    break;
                }
            } else {
                sb.append(board.charAt(i));
            }
        }

        if (sb.length() == board.length()) {
            System.out.println(sb);
        } else {
            System.out.println(-1);
        }
    }
}
