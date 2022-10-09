package inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

public class Num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = createBoard(scanner);
        int[] moves = createMoves(scanner);
        System.out.println(startCraneGame(board, moves));
    }

    private static int startCraneGame(int[][] board, int[] moves) {
        int count = 0;
        Stack<Integer> bucket = new Stack<>();
        for (int m = 0; m < moves.length; m++) {
            int move = moves[m] - 1;
            int doll = 0;
            for (int i = 0; i < board.length; i++) {
                if (board[i][move] != 0) {
                    doll = board[i][move];
                    board[i][move] = 0;
                    break;
                }
            }
            if (!bucket.empty() && bucket.peek() == doll) {
                bucket.pop();
                count += 2;
            } else {
                bucket.push(doll);
            }

        }
        return count;
    }

    private static int[] createMoves(Scanner scanner) {
        int size = scanner.nextInt();
        int[] moves = new int[size];
        for (int i = 0; i < size; i++) {
            moves[i] = scanner.nextInt();
        }
        return moves;
    }

    private static int[][] createBoard(Scanner scanner) {
        int size = scanner.nextInt();
        int[][] board = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        return board;
    }
}
