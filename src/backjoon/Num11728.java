package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aLength = Integer.parseInt(st.nextToken());
        int bLength = Integer.parseInt(st.nextToken());

        int[] a = new int[aLength];
        int[] b = new int[bLength];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int p1 = 0;
        int p2 = 0;
        StringBuilder sb = new StringBuilder();
        while (p1 < a.length && p2 < b.length) {
            int result = a[p1] < b[p2] ? a[p1++] : b[p2++];
            sb.append(result + " ");
        }
        while (p1 < a.length) {
            sb.append(a[p1++] + " ");
        }
        while (p2 < b.length) {
            sb.append(b[p2++] + " ");
        }
        System.out.println(sb);
    }
}
