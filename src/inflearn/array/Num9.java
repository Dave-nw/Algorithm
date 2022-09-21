package inflearn.array;

import java.util.Scanner;

public class Num9 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(maximumOfMatrix(matrix) < sumOfDiagonal(matrix) ? sumOfDiagonal(matrix) : maximumOfMatrix(matrix));
    }

    public static int maximumOfMatrix(int[][] matrix) {
        int size = matrix.length;
        int maxOfColumn = 0;
        int maxOfRow = 0;

        for (int i = 0; i < size; i++) {
            int sumOfColumns = 0;
            int sumOfRows = 0;
            for (int j = 0; j < size; j++) {
                sumOfColumns += matrix[i][j];
                sumOfRows += matrix[j][i];
            }
            if (maxOfColumn < sumOfColumns) {
                maxOfColumn = sumOfColumns;
            }
            if (maxOfRow < sumOfRows) {
                maxOfRow = sumOfRows;
            }
        }
        return maxOfColumn < maxOfRow ? maxOfRow : maxOfColumn;
    }


    public static int sumOfDiagonal(int[][] matrix) {
        int size = matrix.length;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < size; i++) {
            sum1 += matrix[i][i];
            sum2 += matrix[i][size - 1 - i];
        }
        return sum1 < sum2 ? sum2 : sum1;

    }
}
