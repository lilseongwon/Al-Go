import java.util.*;
public class Main {
    static int[][] arr;
    static int[] answer = new int[2];
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        recur(0, 0, n);

        for(int a : answer) {
            System.out.println(a);
        }
    }

    static void recur(int x, int y, int size) {
        int std = arr[x][y];
        for (int i = x; i < size + x; i++) {
            for (int j = y; j < size + y; j++) {
                if (std != arr[i][j]) {
                    recur(x, y, size / 2);
                    recur(x + size/2, y, size / 2);
                    recur(x, y + size/ 2, size / 2);
                    recur(x + size / 2, y + size / 2, size /2);
                    return;
                }
            }
        }
        answer[std] += 1;
    }
}