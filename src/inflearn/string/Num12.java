package inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int size = Integer.parseInt(br.readLine());
        String str =br.readLine();
        for (int i = 0; i < size; i++) {
            String substring = str.substring(i * 7, (i + 1) * 7);
            sb.append(decode(substring));
        }
        System.out.println(sb);
    }

    public static char decode(String code) {
        StringBuffer result = new StringBuffer();
        for (char c : code.toCharArray()) {
            if (c == '#') {
                result.append(1);
            } else if (c == '*') {
                result.append(0);
            }
        }
        return (char)binaryToDecimal(result.toString());
    }

    private static int binaryToDecimal(String binary) {
        int result = 0;
        char[] binaryArr = binary.toCharArray();
        for (int i = 0; i < binaryArr.length; i++) {
            result += Math.pow(2, binaryArr.length - 1 - i) * (binaryArr[i] - '0');
        }
        return result;
    }
}
