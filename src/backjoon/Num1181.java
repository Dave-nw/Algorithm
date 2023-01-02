package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = br.readLine();
        }
        Arrays.sort(words, new Compare());
        StringBuilder sb = new StringBuilder();
        sb.append(words[0]);
        sb.append("\n");
        for (int i = 1; i < words.length; i++) {
            if (!words[i].equals(words[i-1])) {
                sb.append(words[i]);
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }

    private static class Compare implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            int result = 0;
            if (o1 instanceof String && o2 instanceof String) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                result = s1.length() - s2.length();
                if (result == 0) {
                    for (int i = 0; i < s1.length(); i++) {
                        if (s1.charAt(i) != s2.charAt(i)) {
                            return s1.charAt(i) - s2.charAt(i);
                        }
                    }
                }
                return result;
            }
            return result;
        }
    }
}
