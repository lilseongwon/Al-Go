import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        while (n > 0) {
            int m = kb.nextInt();
            int[][] arr = new int[2][m];
            for (int i = 0; i < m; i++) {
                    arr[0][i] = kb.nextInt();
            }
            for (int i = 0; i < m; i++) {
                arr[1][i] = kb.nextInt();
            }
            for (int i = 1; i < m; i++) {
                for (int j = 0; j < 2; j++) {
                    int max = arr[1-j][i-1];
                    if (i >= 2) {
                        max = Math.max(max, arr[1-j][i-2]);
                    }
                    arr[j][i] += max;
                }
            }
            System.out.println(Math.max(arr[0][m-1], arr[1][m-1]));
            n--;
        }
    }
}