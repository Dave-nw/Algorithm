package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num21918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfBulbs = Integer.parseInt(st.nextToken());
        int numberOfOrders = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] bulbs = new int[numberOfBulbs + 1];
        for (int i = 1; i <= numberOfBulbs; i++) {
            bulbs[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < numberOfOrders; i++) {
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            switch (order) {
                case 1:
                    bulbs[l] = r;
                    break;
                case 2:
                    for (int index = l; index <= r; index++) {
                        bulbs[index] = (bulbs[index] == 0) ? 1 : 0;
                    }
                    break;
                case 3:
                    for (int index = l; index <= r; index++) {
                        bulbs[index] = 0;
                    }
                    break;
                case 4:
                    for (int index = l; index <= r; index++) {
                        bulbs[index] = 1;
                    }
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= numberOfBulbs; i++) {
            sb.append(bulbs[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
