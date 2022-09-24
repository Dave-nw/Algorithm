package inflearn.array;

import java.util.Scanner;

public class Num12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        int numberOfMathTests = scanner.nextInt();
        int[][] testResult = new int[numberOfMathTests][numberOfStudents];
        int count = 0;

        for (int i = 0; i < numberOfMathTests; i++) {
            for (int j = 0; j < numberOfStudents; j++) {
                testResult[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < numberOfStudents - 1; i++) {
            int mentor = testResult[0][i];
            for (int j = i + 1; j < numberOfStudents; j++) {
                int mentee = testResult[0][j];
                boolean flag = true;
                for (int k = 1; k < numberOfMathTests; k++) {
                    if (indexOfStudent(testResult[k], mentee) < indexOfStudent(testResult[k], mentor)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    private static int indexOfStudent(int[] testResult, int student) {
        for (int i = 0; i < testResult.length; i++) {
            if (testResult[i] == student) {
                return i;
            }
        }
        return -1;
    }

}
