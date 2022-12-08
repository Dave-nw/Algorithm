package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Num18258 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = java.lang.Integer.parseInt(br.readLine());

        Q q = new Q();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if (order.equals("push")) {
                int number = java.lang.Integer.parseInt(st.nextToken());
                q.push(number);
            } else if (order.equals("pop")) {
                result.append(q.pop() + "\n");
            } else if (order.equals("size")) {
                result.append(q.size() + "\n");
            } else if (order.equals("empty")) {
                result.append(q.empty() + "\n");
            } else if (order.equals("front")) {
                result.append(q.front() + "\n");
            } else if (order.equals("back")) {
                result.append(q.back() + "\n");
            }
        }
        System.out.println(result);
    }
}

class Q {
    private List<Integer> queue = new LinkedList<>();

    public void push(Integer o) {
        queue.add(o);
    }

    public int pop() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.remove(0);
    }

    public int size() {
        return queue.size();
    }

    public int empty() {
        return queue.isEmpty() ? 1 : 0;
    }

    public int front() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.get(0);
    }

    public int back() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.get(queue.size() - 1);
    }
}