package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num4659 {
    final static String ROW_QUALITY = "<%s> is not acceptable.";
    final static String HIGH_QUALITY = "<%s> is acceptable.";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabets = new int[26];
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels) {
            alphabets[vowel - 'a'] = 1;
        }

        StringBuilder sb = new StringBuilder();
        String word = br.readLine();
        while (!word.equals("end")) {
            String result = HIGH_QUALITY;
            if (isContainVowels(alphabets, word) || isContinuous(alphabets, word) || isSameLetterTwice(word)) {
                result = ROW_QUALITY;
            }
            System.out.printf(result, word);
            System.out.println();
            word = br.readLine();
        }
    }

    private static boolean isSameLetterTwice(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i+1)) {
                if (word.charAt(i) != 'e' && word.charAt(i) != 'o' ){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isContinuous(int[] alphabets, String word) {
        for (int i = 0; i < word.length() - 2; i++) {
            char c = word.charAt(i);
            if (alphabets[c - 'a'] == 1 && alphabets[word.charAt(i + 1) - 'a'] == 1 && alphabets[word.charAt(i + 2) - 'a'] == 1) {
                return true;
            } else if (alphabets[c - 'a'] == 0 && alphabets[word.charAt(i + 1) - 'a'] == 0 && alphabets[word.charAt(i + 2) - 'a'] == 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean isContainVowels(int[] alphabets, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (alphabets[word.charAt(i) - 'a'] == 1) {
                return false;
            }
        }
        return true;
    }
}
