package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num3029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] current = br.readLine().split(":");
        String[] timeToStart = br.readLine().split(":");
        int hour = 0, min = 0, sec;

        sec = Integer.parseInt(timeToStart[2]) - Integer.parseInt(current[2]);
        if (sec < 0) {
            sec += 60;
            min--;
        }
        min += Integer.parseInt(timeToStart[1]) - Integer.parseInt(current[1]);
        if (min < 0) {
            min += 60;
            hour--;
        }
        hour += Integer.parseInt(timeToStart[0]) - Integer.parseInt(current[0]);
        if (hour < 0) {
            hour += 24;
        }

        if (hour == 0 && min == 0 && sec == 0) {
            hour = 24;
        }
        System.out.printf("%02d:%02d:%02d", hour, min, sec);
    }
}
