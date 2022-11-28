package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Num10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cycle = Integer.parseInt(br.readLine());
        for (int c = 1; c <= cycle; c++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int testCase = Integer.parseInt(st.nextToken());
            int result = 0;
            List<Integer> students = new LinkedList<>();
            students.add(Integer.parseInt(st.nextToken()));
            for (int i = 1; i < 20; i++) {
                int student = Integer.parseInt(st.nextToken());
                if (students.get(students.size() - 1) < student) {
                    students.add(student);
                } else {
                    int index = students.size() - 1;
                    for (; 0 <= index; index--) {
                        if (students.get(index) < student) {
                            break;
                        }
                    }
                    result += (students.size() - index - 1);
                    students.add(index + 1, student);
                }
            }
            System.out.println(testCase + " " + result);
        }
    }
}
