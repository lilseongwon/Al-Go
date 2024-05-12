import java.util.*;

class App {
    int memory;
    int cost;

    App(int memory) {
        this.memory = memory;
        this.cost = 0; //입력 방법때문에 이렇게 함
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        App[] arr = new App[n+1];

        for(int i = 1; i <= n; i++) {
            arr[i] = new App(kb.nextInt());
        }
        int c = 0;

        for(int i = 1; i <= n; i++) {
            arr[i].cost = kb.nextInt();
            c += arr[i].cost;
        }

        long[][] dp = new long[c+1][n+1];

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= c; j++) {
                if(j - arr[i].cost >= 0 && dp[j-arr[i].cost][i-1] + arr[i].memory > dp[j][i-1]) dp[j][i] = dp[j-arr[i].cost][i-1] + arr[i].memory;
                else dp[j][i] = dp[j][i-1];
            }
        }

        for(int i = 0; i <= c; i++) {
            for(int j = 1; j <= n; j++) {
                if(dp[i][j] >= m) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}