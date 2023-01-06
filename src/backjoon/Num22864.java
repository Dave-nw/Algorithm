package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num22864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = 0;
        int currentFatigue = 0;

        for (int i = 0; i < 24; i++) {
            if (currentFatigue + a <= m){
                currentFatigue += a;
                result += b;
            }else {
                currentFatigue -= c;
            }
            if (currentFatigue < 0){
                currentFatigue = 0;
            }
        }
        System.out.println(result);

    }
}
