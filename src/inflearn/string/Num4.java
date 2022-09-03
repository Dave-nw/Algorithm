package inflearn.string;

import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[] strArr = new String[size];

        for (int i = 0; i < size; i++) {
            strArr[i] = reverse(scanner.nextLine());
        }

        for (String result : strArr) {
            System.out.println(result);
        }
    }

    public static String reverse(String str) {
        StringBuffer sb = new StringBuffer();

        for (int i = str.length()-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
