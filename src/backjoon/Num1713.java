package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num1713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfPhotoFrames = Integer.parseInt(br.readLine());
        int numberOfStudents = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> photoFrames = new LinkedList<>();

        for (int i = 0; i < numberOfStudents; i++) {
            int student = Integer.parseInt(st.nextToken());
            if (map.containsKey(student)) {
                map.put(student, map.get(student) + 1);
            } else {
                map.put(student, 1);
                if (numberOfPhotoFrames <= photoFrames.size()) {
                    int size = photoFrames.size();
                    int min = Integer.MAX_VALUE;
                    for (int j = 0; j < size; j++) {
                        int number = photoFrames.get(j);
                        if (map.get(number) < min) {
                            min = map.get(number);
                        }
                    }

                    for (int j = 0; j < size; j++) {
                        int number = photoFrames.get(j);
                        if (map.get(number) == min) {
                            photoFrames.remove(j);
                            map.remove(number);
                            break;
                        }
                    }
                }
                photoFrames.add(student);
            }
        }
        Collections.sort(photoFrames);
        for (int student :
                photoFrames) {
            System.out.print(student + " ");
        }


    }
}
