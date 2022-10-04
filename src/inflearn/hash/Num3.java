package inflearn.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int days = scanner.nextInt();
        int[] revenues = new int[size];
        for (int i = 0; i < size; i++) {
            revenues[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < days; i++) {
            map.put(revenues[i], map.getOrDefault(revenues[i], 0) + 1);
        }
        System.out.print(map.size() + " ");

        for (int lp = 0, rp = days; rp < size; lp++, rp++) {
            if (map.get(revenues[lp]) == 1) {
                map.remove(revenues[lp]);
            } else {
                map.put(revenues[lp], map.get(revenues[lp]) - 1);
            }
            map.put(revenues[rp], map.getOrDefault(revenues[rp], 0) + 1);
            System.out.print(map.size() + " ");
        }
    }
}
