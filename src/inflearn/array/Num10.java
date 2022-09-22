package inflearn.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[][] mountain = new int[size][size];
        for (int i = 0; i < size; i++) {
            String[] strArr = br.readLine().split(" ");
            for (int j = 0; j < size; j++) {
                mountain[i][j] = Integer.parseInt(strArr[j]);
            }
        }
        System.out.println(CountThePeaks(mountain));
    }

    private static int CountThePeaks(int[][] mountain) {
        int count = 0;
        int size = mountain.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!(isOufOfSize(size, i, j + 1) || mountain[i][j + 1] < mountain[i][j])) {
                    continue;
                }
                if (!(isOufOfSize(size, i, j - 1) || mountain[i][j - 1] < mountain[i][j])) {
                    continue;
                }
                if (!(isOufOfSize(size, i - 1, j) || mountain[i - 1][j] < mountain[i][j])) {
                    continue;
                }
                if (!(isOufOfSize(size, i + 1, j) || mountain[i + 1][j] < mountain[i][j])) {
                    continue;
                }
                count++;
                j++;
            }
        }

        return count;
    }

    public static boolean isOufOfSize(int size, int row, int column) {
        return !((0 <= row && row < size) && (0 <= column && column < size));
    }
}
