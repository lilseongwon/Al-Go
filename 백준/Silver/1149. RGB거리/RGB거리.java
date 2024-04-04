import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][3];
        for(int i = 0; i < n; i++) {
            arr[i][0] = kb.nextInt();
            arr[i][1] = kb.nextInt();
            arr[i][2] = kb.nextInt();
        }
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                int min = 100000000;
                for(int k = 0; k < 3; k++) {
                    if(j != k) {
                        min = Math.min(min, arr[i-1][k]);
                    }
                }
                arr[i][j] += min;
            }
        }

        int min = 100000000;
        for(int i = 0; i < 3; i++) {
            min = Math.min(arr[n-1][i], min);
        }
        System.out.println(min);
    }
}