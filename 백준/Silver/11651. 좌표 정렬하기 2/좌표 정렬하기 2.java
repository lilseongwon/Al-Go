import java.util.*;

class Point implements Comparable<Point>{
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(o.y != y) return Integer.compare(y, o.y);
        else return Integer.compare(x, o.x);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(kb.nextInt(), kb.nextInt());
        }
        Arrays.sort(points);
        for(Point p : points) {
            System.out.println(p.x + " " + p.y);
        }
    }
}