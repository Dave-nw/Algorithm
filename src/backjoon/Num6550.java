package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num6550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String test = br.readLine();

        while (test != null && !test.equals("")) {
            StringTokenizer st = new StringTokenizer(test);
            String s = st.nextToken();
            String t = st.nextToken();

            sb.append(isSubString(s, t) ? "Yes" : "No");
            sb.append("\n");
            test = br.readLine();
        }
        System.out.println(sb);
    }

    private static boolean isSubString(String s, String t) {
        int count = 0;
        int sPointer = 0;
        int tPointer = 0;
        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                count++;
                sPointer++;
            }
            tPointer++;
        }
        return count == s.length();
    }
}
