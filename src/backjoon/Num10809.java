package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Num10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Character> list = new ArrayList<>();
        for (char c : br.readLine().toCharArray()) {
            list.add(c);
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if (list.contains(c)) {
                System.out.print(list.indexOf(c) + " ");
            } else {
                System.out.print(-1 + " ");
            }
        }
    }
}
