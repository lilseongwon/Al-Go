import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        int answer = arr[0];
        for(int i = 1; i < n; i++) {
            arr[i] = Math.max(arr[i], arr[i] + arr[i-1]);
            answer = Math.max(arr[i], answer);
        }
        System.out.println(answer);
    }
}