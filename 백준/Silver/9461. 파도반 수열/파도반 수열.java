import java.util.Scanner;

public class Main {
    static long[] dp = new long[101];
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dp[1] = dp[2] = dp[3] = 1;
        while(n > 0) {
            int tmp = kb.nextInt();
            System.out.println(recur(tmp));
            n--;
        }
    }

    static long recur(int n) {
        if(dp[n] != 0) return dp[n];
        return dp[n] = recur(n-2) + recur(n-3);
    }
}