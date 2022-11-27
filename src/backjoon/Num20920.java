package backjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class Num20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfWords = Integer.parseInt(st.nextToken());
        int limitLength = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < numberOfWords; i++) {
            String word = br.readLine();
            if (limitLength <= word.length()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        List<Word> words = new LinkedList<>();
        for (String s : map.keySet()) {
            Word word = new Word(s, map.get(s));
            words.add(word);
        }
        Collections.sort(words);

        for (Word word: words) {
            bw.write(word.word);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

}

class Word implements Comparable<Word>{
    String word;
    int frequency;

    public Word(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    private int compareFrequency(Word target) {
        return target.frequency - frequency;
    }

    private int compareLength(Word target) {
        return target.word.length() - word.length();
    }

    @Override
    public int compareTo(Word target) {
        int result = compareFrequency(target);
        if (result == 0) {
            result = compareLength(target);
            if (result == 0) {
                return word.compareTo(target.word);
            }
        }
        return result;
    }
}
