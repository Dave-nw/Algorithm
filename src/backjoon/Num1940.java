package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfMaterials = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());

        int[] materials = new int[numberOfMaterials];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numberOfMaterials; i++) {
            materials[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for (int i = 0; i < materials.length - 1; i++) {
            for (int j = i + 1; j < materials.length; j++) {
                if (materials[i] + materials[j] == target) {
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
