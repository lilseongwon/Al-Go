import java.util.*;

class Item {
    int w;
    int v;

    Item(int w, int v) {
        this.w = w;
        this.v = v;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();

        Item[] arr = new Item[n + 1];
        int[][] dp = new int[k + 1][n + 1]; //0으로 테두리 감싸기

        for (int i = 1; i <= n; i++) {
            arr[i] = new Item(kb.nextInt(), kb.nextInt());
        }

        for (int i = 1; i <= n; i++) { //갯수
            for (int j = 1; j <= k; j++) { //배낭 무게
                if (j - arr[i].w >= 0 && dp[j - arr[i].w][i - 1] + arr[i].v > dp[j][i - 1])
                    dp[j][i] = dp[j - arr[i].w][i - 1] + arr[i].v;
                else dp[j][i] = dp[j][i - 1];
            }
        }
        System.out.println(dp[k][n]);
    }
}