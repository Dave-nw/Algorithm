package inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (isPalindrome(str)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    public static boolean isPalindrome(String str) {
        char[] cArr = str.trim().toLowerCase().toCharArray();
        int left = 0;
        int right = cArr.length - 1;

        while (left < right){
            if (Character.isAlphabetic(cArr[left])){
                if (Character.isAlphabetic(cArr[right])){
                    if (cArr[left]!=cArr[right]){
                        return false;
                    }else {
                        left++;
                        right--;
                    }
                }else {
                    right--;
                }
            }else {
                left++;
            }
        }
        return true;
    }
}
