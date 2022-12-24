package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num11508 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] products = new int[size];
        for (int i = 0; i < size; i++) {
            products[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(products);
        int count = 0;
        int sum = 0;
        for (int i = products.length-1; 0 <= i; i--) {
            count++;
            if (3 <= count) {
                count = 0;
            }else {
                sum+= products[i];
            }
        }
        System.out.println(sum);
    }
}
