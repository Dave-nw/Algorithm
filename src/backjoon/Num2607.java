package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2607 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        String word = br.readLine();

        String[] targets = new String[size - 1];
        for (int i = 0; i < targets.length; i++) {
            targets[i] = br.readLine();
        }

        int count = 0;
        for (String target : targets) {
            if (isSimilar(word, target)) {
                count++;
            }
        }
        System.out.println(count);
        br.close();

    }

    private static int[] convertToArr(String word) {

        int[] alphabets = new int[26];
        for (char c : word.toCharArray()) {
            int index = c - 'A';
            alphabets[index]++;
        }
        return alphabets;
    }

    private static boolean isSimilar(String word, String target) {
        int longLength = Math.max(word.length(), target.length());
        int shortLength = Math.min(word.length(), target.length());
        if (1 < longLength - shortLength) {
            return false;
        }

        int[] wordArr = convertToArr(word);
        int[] targetArr = convertToArr(target);

        int match = 0;
        for (int i = 0; i < wordArr.length; i++) {
            if (0 < wordArr[i] && 0 < targetArr[i]) {
                if (wordArr[i] == targetArr[i]) {
                    match += wordArr[i];
                } else {
                    match += Math.min(wordArr[i], targetArr[i]);
                }
            }
        }
        if (longLength - shortLength == 0) {
            return word.length() - 1 <= match;
        }

        return shortLength <= match;
    }
}
