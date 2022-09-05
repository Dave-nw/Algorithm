package inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] cArr = str.toCharArray();

        int right = cArr.length - 1;

        for (int left = 0; left < right; left++) {
            if (Character.isAlphabetic(cArr[left])) {
                if (Character.isAlphabetic(cArr[right])) {
                    char tmp = cArr[left];
                    cArr[left] = cArr[right];
                    cArr[right] = tmp;
                }else {
                    left --;
                }
                right --;
            }
        }
        System.out.println(cArr);
    }
}
