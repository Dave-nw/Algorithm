package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Num10866 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cycle = Integer.parseInt(br.readLine());

        MyDeque deque = new MyDeque();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cycle; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if (order.equals("push_front")){
                int number = Integer.parseInt(st.nextToken());
                deque.pushFront(number);
            }else if (order.equals("push_back")){
                int number = Integer.parseInt(st.nextToken());
                deque.pushBack(number);
            }else if (order.equals("pop_front")){
                sb.append(deque.popFront()+"\n");
            }else if (order.equals("pop_back")){
                sb.append(deque.popBack()+"\n");
            }else if (order.equals("size")){
                sb.append(deque.size() + "\n");
            }else if (order.equals("empty")){
                sb.append(deque.isEmpty() +"\n");
            }else if (order.equals("front")){
                sb.append(deque.front() + "\n");
            }else if (order.equals("back")){
                sb.append(deque.back() + "\n");
            }
        }
        System.out.println(sb);
    }
}

class MyDeque {
    private List<Integer> deque = new LinkedList<>();

    public void pushFront(int o) {
        deque.add(0, o);
    }

    public void pushBack(int o) {
        if (deque.isEmpty()) {
            deque.add(0, o);
            return;
        }
        deque.add(o);
    }

    public int popFront() {
        return deque.isEmpty() ? -1 : deque.remove(0);
    }

    public int popBack() {
        return deque.isEmpty() ? -1 : deque.remove(deque.size() - 1);
    }

    public int size() {
        return deque.size();
    }

    public int isEmpty() {
        return deque.isEmpty() ? 1 : 0;
    }

    public int front() {
        return deque.isEmpty() ? -1 : deque.get(0);
    }

    public int back() {
        return deque.isEmpty() ? -1 : deque.get(deque.size() - 1);
    }
}
