package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num2309 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarfs = new int[9];
        int sum = 0;
        for (int i = 0; i < dwarfs.length; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
            sum += dwarfs[i];
        }
        Arrays.sort(dwarfs);
        int lp = 0;
        int rp = dwarfs.length - 1;
        while (lp < rp) {
            int result = sum - dwarfs[lp] - dwarfs[rp];
            if (result == 100) {
                break;
            } else if (100 < result) {
                lp++;
            } else {
                rp--;
            }
        }

        for (int i = 0; i < dwarfs.length; i++) {
            if (i == lp || i == rp) {
                continue;
            }
            System.out.println(dwarfs[i]);
        }

    }
}
