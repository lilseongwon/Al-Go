import java.util.*;

class Point {
    int max;
    int min;

    Point() {
        this.max = -1;
        this.min = 1000000;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        Point[] dp = new Point[3];
        for (int j = 0; j < 3; j++) {
            dp[j] = new Point();
        }

        for (int i = 0; i < 3; i++) {
            dp[i].min = dp[i].max = arr[0][i];
        }

        for (int i = 1; i < n; i++) {
            Point[] temp = {new Point(), new Point(), new Point()};
            for (int j = 0; j < 3; j++) {
                for (int k = -1; k < 2; k++) {
                    if (j + k < 0 || j + k > 2) continue;
                    int max = arr[i][j] + dp[j + k].max;
                    int min = arr[i][j] + dp[j + k].min;
                    if (max > temp[j].max) temp[j].max = max;
                    if (min < temp[j].min) temp[j].min = min;
                }
            }
            for(int l = 0; l < 3; l++) {
                dp[l].max = temp[l].max;
                dp[l].min = temp[l].min;
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Point p : dp) {
            max = Math.max(p.max, max);
            min = Math.min(p.min, min);
        }
        System.out.println(max + " " + min);
    }
}