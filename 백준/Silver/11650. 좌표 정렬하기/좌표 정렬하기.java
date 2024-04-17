import java.util.*;

class Point implements Comparable<Point> {
    int a;
    int b;

    Point(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Point o) {
        if(a != o.a) {
            return a - o.a;
        } else {
            return b - o.b;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Point[] arr = new Point[n];
        for(int i = 0; i < n; i++) {
            arr[i] = new Point(kb.nextInt(), kb.nextInt());
        }
        Arrays.sort(arr);
        for(Point p : arr) {
            System.out.println(p.a + " " + p.b);
        }
    }
}