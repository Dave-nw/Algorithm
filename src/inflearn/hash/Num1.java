package inflearn.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] candidates = {"A", "B", "C", "D", "E"};
        int size = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> map = new HashMap();
        for (String s : scanner.nextLine().split("")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        String result = "";
        for (int i = 0; i < candidates.length; i++) {
            int num = map.get(candidates[i]);
            if (max < num) {
                max = num;
                result = candidates[i];
            }
        }
        System.out.println(result);
    }
}
