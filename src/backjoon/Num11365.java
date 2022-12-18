package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        String password = br.readLine();
        while (!password.equals("END")) {
            StringBuilder sb = new StringBuilder(password);
            result.append(sb.reverse() + "\n");
            password = br.readLine();
        }
        System.out.println(result);
    }
}
