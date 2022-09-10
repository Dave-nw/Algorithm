package inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] cArr = br.readLine().toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < cArr.length; i++) {
            int count = 1;
            sb.append(cArr[i]);
            for (int j = i + 1; j < cArr.length; j++) {
                if (cArr[i] == cArr[j]) {
                    count++;
                    i++;
                }else {
                    break;
                }
            }
            if (1 < count) {
                sb.append(count);
            }
        }
        System.out.println(sb.toString());
    }
}
