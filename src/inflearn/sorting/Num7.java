package inflearn.sorting;

import java.util.*;

public class Num7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Coordinate> coordinates = createCoordinates(scanner, size);
        Collections.sort(coordinates);
        for (Coordinate c : coordinates) {
            System.out.println(c);
        }

    }

    private static List<Coordinate> createCoordinates(Scanner scanner, int size) {
        List<Coordinate> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            result.add(new Coordinate(x, y));
        }
        return result;
    }
}

class Coordinate implements Comparable<Coordinate> {
    private int x;
    private int y;

    private Coordinate() {
    }

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Coordinate c) {
        if (this.x == c.x) {
            if (this.y == c.y) {
                return 0;
            } else if (this.y < c.y) {
                return -1;
            }
        } else if (this.x < c.x) {
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
