package inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "";
        for (String s : str.split("")) {
            if (result.contains(s)){
                continue;
            }
            result += s;
        }
        System.out.println(result);
    }
}
