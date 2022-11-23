package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1012 {
    final static int[] DX = {0, 0, -1, 1}; //up,down,left,right
    final static int[] DY = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int test = 0; test < testCase; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            int numberOfCabbage = Integer.parseInt(st.nextToken());

            Cabbage[] cabbages = new Cabbage[numberOfCabbage];
            for (int i = 0; i < cabbages.length; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                cabbages[i] = new Cabbage(x, y);
            }

            int count = 0;
            for (int i = 0; i < cabbages.length; i++) {
                if (!cabbages[i].checked) {
                    count++;
                    solution(cabbages, cabbages[i]);
                }
            }
            System.out.println(count);
        }
    }

    private static void solution(Cabbage[] cabbages, Cabbage cabbage) {
        cabbage.checked = true;
        method(cabbages, cabbage.width + DX[0], cabbage.height + DY[0]);
        method(cabbages, cabbage.width + DX[1], cabbage.height + DY[1]);
        method(cabbages, cabbage.width + DX[2], cabbage.height + DY[2]);
        method(cabbages, cabbage.width + DX[3], cabbage.height + DY[3]);

    }

    private static void method(Cabbage[] cabbages, int width, int height) {
        for (int i = 0; i < cabbages.length; i++) {
            if (!cabbages[i].checked && cabbages[i].width == width && cabbages[i].height == height) {
                solution(cabbages, cabbages[i]);
            }
        }
    }


}

class Cabbage {
    int width;
    int height;
    boolean checked;

    public Cabbage(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
