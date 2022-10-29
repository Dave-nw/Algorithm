package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int size = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        Queue<Integer> numbers = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            numbers.offer(i + 1);
        }

        int count = 0;
        while (!numbers.isEmpty()) {
            int number = numbers.poll();
            count++;
            if (count == target) {
                answer.add(number);
                count = 0;
            } else {
                numbers.offer(number);
            }
        }
        System.out.print("<");
        for (int i = 0; i < answer.size() - 1; i++) {
            System.out.print(answer.get(i) + ", ");
        }
        System.out.println(answer.get(answer.size() - 1) +">");
    }
}
