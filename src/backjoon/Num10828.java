package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            Stack s = new Stack();
            if (order.equals("push")) {
                int number = Integer.parseInt(st.nextToken());
                s.push(number);
            } else {
                int result = 0;
                if (order.equals("pop")) {
                    result = s.pop();
                } else if (order.equals("size")) {
                    result = s.size();
                } else if (order.equals("empty")) {
                    result = s.empty();
                } else if (order.equals("top")) {
                    result = s.top();
                }
                System.out.println(result);
            }
        }
    }
}


class Stack {
    final static List<Integer> list = new ArrayList<>();

    public void push(Integer number) {
        list.add(number);
    }

    public int pop() {
        if (list.isEmpty()) {
            return -1;
        }
        return list.remove(list.size() - 1);
    }

    public int size() {
        return list.size();
    }

    public int empty() {
        return list.isEmpty() ? 1 : 0;
    }

    public int top() {
        if (list.isEmpty()) {
            return -1;
        }
        return list.get(list.size() - 1);
    }
}
