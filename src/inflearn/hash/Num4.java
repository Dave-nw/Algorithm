package inflearn.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Num4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] characters = br.readLine().toCharArray();
        Map<Character, Integer> word = new HashMap<>();
        Map<Character, Integer> targetWord = new HashMap<>();
        String str = br.readLine();
        int count = 0;

        for (char c : str.toCharArray()) {
            targetWord.put(c, targetWord.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < str.length() - 1; i++) {
            word.put(characters[i], word.getOrDefault(characters[i], 0) + 1);
        }

        for (int lp = 0, rp = str.length() - 1; rp < characters.length; lp++, rp++) {
            word.put(characters[rp], word.getOrDefault(characters[rp], 0) + 1);
            if (isAnagram(word, targetWord)) {
                count++;
            }
            word.put(characters[lp], word.get(characters[lp]) - 1);
            if (word.get(characters[lp]) == 0) {
                word.remove(characters[lp]);
            }
        }
        System.out.println(count);
    }

    public static boolean isAnagram(Map<Character, Integer> word1, Map<Character, Integer> word2) {
        if (word1.size() != word2.size()) {
            return false;
        }

        for (Character c : word1.keySet()) {
            if (word1.get(c) != word2.get(c)) {
                return false;
            }
        }
        return true;
    }
}