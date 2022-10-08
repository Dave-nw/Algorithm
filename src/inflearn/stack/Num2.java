package inflearn.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        StringBuffer result = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                if (stack.empty()) {
                    result.append(c);
                }
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            }
        }
        return result.toString();
    }
}