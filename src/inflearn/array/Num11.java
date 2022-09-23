package inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num11 {
    final static int GRADE = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfStudents = Integer.parseInt(br.readLine());
        int[][] studentsArr = new int[numOfStudents][GRADE];
        int[] result = new int[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < GRADE; j++) {
                studentsArr[i][j] = Integer.parseInt(s[j]);
            }
        }

        for (int i = 0; i < numOfStudents - 1; i++) {
            for (int j = i + 1; j < numOfStudents; j++) {
                if (isSameClass(studentsArr[i], studentsArr[j])) {
                    result[i]++;
                    result[j]++;
                }

            }
        }
        System.out.println(maximumIndex(result) + 1);
    }

    private static int maximumIndex(int[] result) {
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if (max < result[i]) {
                max = result[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static boolean isSameClass(int[] student1, int[] student2) {
        for (int i = 0; i < GRADE; i++) {
            if (student1[i] == student2[i]) {
                return true;
            }
        }
        return false;
    }
}
