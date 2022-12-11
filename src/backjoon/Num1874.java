package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        int[] targets = new int[n];
        for (int i = 0; i < n; i++) {
            targets[i] = Integer.parseInt(br.readLine());
            numbers[i] = i + 1;
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        boolean isImpossible = false;
        int numberIndex = 0;
        for (int i = 0; i < targets.length; i++) {
            int target = targets[i];

            if (stack.isEmpty()) {
                stack.push(numbers[numberIndex]);
                result.append("+" + "\n");
                numberIndex++;
            }

            if (target < stack.peek()) {
                isImpossible = true;
                break;
            }

            if (stack.peek() < target) {
                while (numberIndex < n && numbers[numberIndex] <= target) {
                    stack.push(numbers[numberIndex]);
                    result.append("+" + "\n");
                    numberIndex++;
                }
            }

            if (stack.peek() == target) {
                stack.pop();
                result.append("-" + "\n");
            }
        }

        if (isImpossible) {
            System.out.println("NO");
        } else {
            System.out.println(result);
        }
    }
}
