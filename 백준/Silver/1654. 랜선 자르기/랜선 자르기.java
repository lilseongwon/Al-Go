import java.util.*;

public class Main {
    static long[] arr;
    static int n;
    static long k;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new long[n];
        k = kb.nextInt();
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        long start = 1;
        long end = Integer.MAX_VALUE;
        long mid;
        while(start <= end) {
            mid = (start + end) / 2;
            if(check(mid)) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        System.out.println(end);
    }

    static boolean check(long mid) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i] / mid;
        }
        return (sum >= k);
    }
}