package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Num2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        Queue<Integer> cards = new LinkedList<>();
        for (int i = 0; i < number; i++) {
            cards.add(i + 1);
        }

        while (cards.size() != 1){
            cards.poll();
            cards.add(cards.poll());
        }
        System.out.println(cards.poll());
    }
}
