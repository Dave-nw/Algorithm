package inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder digit = new StringBuilder();

        for (char c: str.toCharArray()) {
            if (Character.isDigit(c)){
                digit.append(c);
            }
        }
        System.out.println(Integer.parseInt(digit.toString()));

    }
}
