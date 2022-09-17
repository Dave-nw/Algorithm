package inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int count = 0;
        int score = 0;
        for (String s : br.readLine().split(" ")) {
            int num = Integer.parseInt(s);
            if (num == 0) {
                count = 0;
            } else {
                count++;
                score += count;
            }
        }
        System.out.println(score);

    }
}
