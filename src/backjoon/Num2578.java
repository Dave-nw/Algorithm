package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Num2578 {

    final static int BINGO_BOARD_SIZE = 5;
    final static int BINGO_COUNT = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] bingoBoard = new int[BINGO_BOARD_SIZE][BINGO_BOARD_SIZE];
        Map<Integer, BingoNumber> map = new HashMap<>();
        for (int i = 0; i < BINGO_BOARD_SIZE; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < BINGO_BOARD_SIZE; j++) {
                int number = Integer.parseInt(st.nextToken());
                map.put(number, new BingoNumber(i, j));
            }
        }

        System.out.println(bingoCount(br, bingoBoard, map));


    }

    private static int bingoCount(BufferedReader br, int[][] bingoBoard, Map<Integer, BingoNumber> map) throws IOException {
        int count = 0;
        for (int i = 0; i < BINGO_BOARD_SIZE; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < BINGO_BOARD_SIZE; j++) {
                count++;
                int number = Integer.parseInt(st.nextToken());
                BingoNumber bingoNumber = map.get(number);
                bingoBoard[bingoNumber.getX()][bingoNumber.getY()] = 1;
                if (isBingo(bingoBoard)) {
                    return count;
                }
            }
        }
        return count;
    }

    public static boolean isBingo(int[][] bingoBoard) {
        return BINGO_COUNT <= checkRowAndColumn(bingoBoard) + checkDiagonal(bingoBoard);
    }

    private static int checkRowAndColumn(int[][] bingoBoard) {
        int totalCount = 0;
        for (int i = 0; i < BINGO_BOARD_SIZE; i++) {
            int RowCount = 0;
            int ColumnCount = 0;
            for (int j = 0; j < BINGO_BOARD_SIZE; j++) {
                if (bingoBoard[i][j] == 1){
                    RowCount ++;
                }
                if (bingoBoard[j][i] == 1) {
                    ColumnCount ++;
                }
            }
            if (RowCount == BINGO_BOARD_SIZE ){
                totalCount++;
            }
            if (ColumnCount == BINGO_BOARD_SIZE){
                totalCount++;
            }
        }
        return totalCount;
    }

    private static int  checkDiagonal(int[][] bingoBoard) {
        int totalCount = 0;
        int leftToRightCount = 0;
        int RightToLeftCount = 0;
        for (int i = 0; i < bingoBoard.length; i++) {
            if (bingoBoard[i][i] == 1) {
                leftToRightCount++;
            }
            if (bingoBoard[i][bingoBoard.length - i - 1] == 1) {
                RightToLeftCount++;
            }
        }
        if (leftToRightCount == BINGO_BOARD_SIZE){
            totalCount++;
        }
        if (RightToLeftCount == BINGO_BOARD_SIZE){
            totalCount++;
        }
        return totalCount;
    }
}

class BingoNumber {
    private int x;
    private int y;

    public BingoNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
