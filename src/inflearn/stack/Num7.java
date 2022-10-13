package inflearn.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Num7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Character> mandatorySubject = new LinkedList<>();

        for (char c: br.readLine().toCharArray()) {
            mandatorySubject.offer(c);
        }

        char[] subjects = br.readLine().toCharArray();
        for (int i = 0; i < subjects.length; i++) {
            if (!mandatorySubject.isEmpty() && mandatorySubject.peek() == subjects[i]) {
                mandatorySubject.poll();
            }
        }

        if (mandatorySubject.isEmpty()) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
