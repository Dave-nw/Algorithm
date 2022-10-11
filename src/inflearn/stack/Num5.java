package inflearn.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        int result = 0;
        char previous = ' ';
        for (char c : chars) {
            if (c == '(') {
                if (previous == '(') {
                    stack.push(c);
                    result ++;
                }
            } else if (c == ')') {
                //레이저 일때
                if (previous == '(') {
                    result += stack.size();
                }
                //레이저 아닐때
                else {
                    stack.pop();
                }
            }
            previous = c;
        }
        System.out.println(result);
    }
}
