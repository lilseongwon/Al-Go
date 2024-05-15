import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            int m = kb.nextInt();

            int[] dp = new int[m+1];

            dp[0] = 1;

            for(int i = 0; i < n; i++) {
                for(int j = arr[i]; j <= m; j++) {
                    dp[j] += dp[j-arr[i]];
                }
            }
            System.out.println(dp[m]);
            t--;
        }
    }
}