package inflearn.array;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gameRound = scanner.nextInt();
        int[] player1 = new int[gameRound];
        int[] player2 = new int[gameRound];

        for (int i = 0; i < gameRound; i++) {
            player1[i] = scanner.nextInt();
        }
        for (int i = 0; i < gameRound; i++) {
            player2[i] = scanner.nextInt();
        }
        RockPaperScissors(gameRound, player1, player2);
    }

    private static void RockPaperScissors(int gameRound, int[] player1, int[] player2) {
        for (int i = 0; i < gameRound; i++) {
            if (player1[i] == player2[i]){
                System.out.println('D');
            }else if ((player1[i] == 1 && player2[i] == 3)||(player1[i] == 2 && player2[i] == 1)||(player1[i] == 3 && player2[i] == 2)){
                System.out.println('A');
            }else {
                System.out.println('B');
            }
        }
    }
}
