package inflearn.dfs_bfs_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num8 {

    static Queue<Integer> queue = new LinkedList<>();
    static int[] move = {1, -1, 5};
    static int[] checkedPosition = new int[10001];
    static int calfPosition;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int playerPosition = Integer.parseInt(st.nextToken());
        calfPosition = Integer.parseInt(st.nextToken());

        System.out.println(solution(playerPosition));

    }

    private static int solution(int playerPosition) {

        checkedPosition[playerPosition] = 1;
        queue.offer(playerPosition);

        int level = 0;
        while (!queue.isEmpty()) {
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                int currentPosition = queue.poll();

                for (int j = 0; j < move.length; j++) {
                    int nextPosition = currentPosition + move[j];
                    if (0 < nextPosition && nextPosition < 10001 && checkedPosition[nextPosition] == 0) {
                        if (nextPosition == calfPosition) {
                            return level + 1;
                        }
                        checkedPosition[nextPosition] = 1;
                        queue.offer(nextPosition);
                    }
                }
            }
            level ++;
        }
        return 0;
    }

}
