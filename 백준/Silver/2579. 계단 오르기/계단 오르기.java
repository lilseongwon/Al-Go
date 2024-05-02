import java.util.*;

public class Main {

    public static void main(String[] args) { //todo 계단오르기 한번 더 구현
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        
        int[] DP = new int[n+1];
        int[] arr = new int[n+1];
        
        for(int i = 1; i <= n; i++) {
            arr[i] = kb.nextInt();
        }
        
        DP[1] = arr[1];
        
        if(n >= 2) {
            DP[2] = arr[1] + arr[2];
        }
        
        for(int i = 3; i <= n; i++) {
            DP[i] = Math.max(DP[i-2], DP[i-3] + arr[i-1]) + arr[i];
        }
        
        System.out.println(DP[n]);
    }
}