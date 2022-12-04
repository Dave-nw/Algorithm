package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String target = br.readLine();
        String beforeStar = "";
        String afterStar = "";
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == '*') {
                beforeStar = target.substring(0, i);
                afterStar = target.substring(i + 1);
            }
        }

        for (int cycle = 0; cycle < size; cycle++) {
            String word = br.readLine();
            System.out.println(solution(word, beforeStar, afterStar) ? "DA" : "NE");
        }

    }

    private static boolean solution(String word, String beforeStar, String afterStar) {
        boolean before = beforeStar.isBlank();
        boolean after = afterStar.isBlank();

        if (!before) {
            before = word.startsWith(beforeStar);
        }

        int index = beforeStar.length();
        if (!after) {
            for (int i = index; i < word.length(); i++) {
                if (afterStar.charAt(0) == word.charAt(i)) {
                    int length = word.length() - i;
                    if (length == afterStar.length()) {
                        after = word.substring(i).equals(afterStar);
                    }
                }
            }
        }
        return  before && after;
    }
}
