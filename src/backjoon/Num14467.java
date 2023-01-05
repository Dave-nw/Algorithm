package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Num14467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cycle = Integer.parseInt(br.readLine());

        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < cycle; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            int position = Integer.parseInt(st.nextToken());
            if (map.containsKey(number)){
                if (map.get(number) != position){
                    count ++;
                }
            }
            map.put(number,position);
        }
        System.out.println(count);
    }
}
