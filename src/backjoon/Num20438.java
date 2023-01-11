package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 학생의 수 N, 졸고 있는 학생의 수 K, 지환이가 출석 코드를 보낼 학생의 수 Q, 주어질 구간의 수 M.
 */
public class Num20438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int lastStudentNumber = n + 2;
        int[] students = new int[lastStudentNumber + 1];

        int[] dozingStudents = new int[k];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            dozingStudents[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < k; i++) {
            int number = dozingStudents[i];
            students[number] = -5000;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < q; i++) {
            int number = Integer.parseInt(st.nextToken());
            boolean isPass = false;
            for (int j = 0; j < k; j++) {
                if (number == dozingStudents[j]){
                    isPass = true;
                    break;
                }
            }
            if (!isPass){
                int multiple = number;
                while (multiple <= lastStudentNumber) {
                    students[multiple]++;
                    multiple += number;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int cycle = 0; cycle < m; cycle++) {
            int count = 0;
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            for (int i = s; i <= e; i++) {
                if (students[i] <=0) {
                    count++;
                }
            }
            sb.append(count);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
