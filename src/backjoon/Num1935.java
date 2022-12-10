package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cycle = Integer.parseInt(br.readLine());
        Stack<Double> stack = new Stack<>();
        double[] numbers = new double[26];
        char[] postfix = br.readLine().toCharArray();
        for (int i = 0; i < postfix.length; i++) {
            if (Character.isAlphabetic(postfix[i])) {
                char alphabet = postfix[i];
                double number = 0;
                if (0 < numbers[alphabet-'A']){
                    number = numbers[alphabet-'A'];
                }else {
                    number = Integer.parseInt(br.readLine());
                    numbers[alphabet-'A'] = number;
                }
                stack.push(number);
            } else {
                double right = stack.pop();
                double left = stack.pop();
                double result = 0;
                switch (postfix[i]) {
                    case '+':
                        result = left + right;
                        break;
                    case '-':
                        result = left - right;
                        break;
                    case '*':
                        result = left * right;
                        break;
                    case '/':
                        result = left / right;
                        break;
                }
                stack.push(result);
            }
        }
        System.out.printf("%.2f",stack.pop());
    }
}
