package inflearn.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else if (c == '+') {
                int right = stack.pop();
                int left = stack.pop() ;
                stack.push(left + right);
            } else if (c == '-') {
                int right = stack.pop();
                int left = stack.pop();
                stack.push(left - right);
            } else if (c == '*') {
                int right = stack.pop();
                int left = stack.pop();
                stack.push(left * right);
            } else if (c == '/') {
                int right = stack.pop();
                int left = stack.pop();
                stack.push(left / right);
            }
        }
        System.out.println(stack.pop());
    }
}
