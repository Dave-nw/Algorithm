package inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");
        int size = 0;
        String result = "";
        for (String str : strArr) {
            if (size < str.length()) {
                size = str.length();
                result = str;
            }
        }
        System.out.println(result);
    }
}
