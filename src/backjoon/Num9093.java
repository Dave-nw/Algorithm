package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            System.out.println(solution(br.readLine()));
        }
    }

    private static String solution(String str) {
        StringBuffer result = new StringBuffer();
        for (String s : str.split(" ")) {
            StringBuffer sb = new StringBuffer(s);
            result.append(sb.reverse() + " ");
        }
        return result.toString();
    }
}
