package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2979 {
    final static int NUMBER_OF_TRUCKS = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] fee = new int[NUMBER_OF_TRUCKS];
        for (int i = 0; i < fee.length; i++) {
            fee[i] = Integer.parseInt(st.nextToken());
        }

        Truck[] trucks = new Truck[NUMBER_OF_TRUCKS];
        int maxTime = Integer.MIN_VALUE;
        for (int i = 0; i < NUMBER_OF_TRUCKS; i++) {
            st = new StringTokenizer(br.readLine());
            int arrivalTime = Integer.parseInt(st.nextToken());
            int departureTime = Integer.parseInt(st.nextToken());
            if (maxTime < departureTime) {
                maxTime = departureTime;
            }
            trucks[i] = new Truck(arrivalTime, departureTime);
        }

        int time = 0;
        int result = 0;
        int count = 0;
        while (time < maxTime) {
            time ++;
            for (int i = 0; i < trucks.length; i++) {
                if (trucks[i].arrivalTime == time) {
                    count ++;
                }else if (trucks[i].departureTime == time) {
                    count --;
                }
            }
            if (0 < count) {
                result += count * fee[count -1];
            }
        }
        System.out.println(result);

    }
}

class Truck {
    int arrivalTime;
    int departureTime;

    public Truck(int arrivalTime, int departureTime) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }
}
