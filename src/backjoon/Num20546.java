package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num20546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sp = new int[14];
        for (int i = 0; i < sp.length; i++) {
            sp[i] = Integer.parseInt(st.nextToken());
        }

        int bnpMoney = money;
        int bnpStock = 0;
        for (int i = 0; i < sp.length; i++) {
            bnpStock += bnpMoney / sp[i];
            bnpMoney %= sp[i];
        }
        int bnp = bnpMoney + bnpStock * sp[13];

        int timingMoney = money;
        int timingStock = 0;
        for (int i = 3; i < sp.length; i++) {
            if (sp[i - 3] < sp[i - 2] && sp[i - 2] < sp[i - 1] && sp[i - 1] < sp[i]) {
                timingMoney += timingStock * sp[i];
                timingStock = 0;
            } else if (sp[i - 3] > sp[i - 2] && sp[i - 2] > sp[i - 1] && sp[i - 1] > sp[i]) {
                timingStock += timingMoney / sp[i];
                timingMoney %= sp[i];
            }
        }
        int timing = timingMoney + timingStock * sp[13];

        System.out.println(bnp == timing ? "SAMESAME" : bnp < timing ? "TIMING" : "BNP");

    }
}
