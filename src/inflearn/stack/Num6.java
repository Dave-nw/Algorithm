package inflearn.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int num = scanner.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            q.offer(i + 1);
        }

        while (q.size() != 1) {
            for (int i = 0; i < num - 1; i++) {
                q.offer(q.poll());
            }
            q.remove();
        }
        System.out.println(q.poll());
    }
}
