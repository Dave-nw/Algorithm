package programmers.stack_queue;

import java.util.*;

public class 프린터 {
    public int solution(int[] priorities, int location) {
        Queue<Document> waitingLine = new LinkedList<>();
        int index = 0;
        for (int priority : priorities) {
            waitingLine.add(new Document(index++, priority));
        }
        Arrays.sort(priorities);

        int answer = 0;
        for (int i = priorities.length - 1; 0 <= i; i--) {
            int priority = priorities[i];
            Document document = waitingLine.poll();

            while (document.getPriority() != priority) {
                waitingLine.add(document);
                document = waitingLine.poll();
            }

            answer ++;
            if (document.getLocation() == location) {
                return answer;
            }

        }
        return answer;
    }
}

class Document {
    private int location;
    private int priority;

    public Document(int location, int priority) {
        this.location = location;
        this.priority = priority;
    }

    public int getLocation() {
        return location;
    }

    public int getPriority() {
        return priority;
    }
}
