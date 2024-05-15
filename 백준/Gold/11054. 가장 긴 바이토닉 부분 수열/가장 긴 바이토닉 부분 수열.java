import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        int[] low = new int[n];
        int[] high = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for(int i = 0; i < n; i++) {
            low[i] = 1;
            high[i] = 1;

            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j] && high[i] < high[j] + 1) {
                    high[i] = high[j] + 1;
                }
                else if(arr[i] < arr[j] && (low[i] < low[j] + 1 || low[i] < high[j] + 1)) {
                    low[i] = Math.max(low[j], high[j]) + 1;
                }
            }
        }

        System.out.println(Math.max(Arrays.stream(low).max().getAsInt(), Arrays.stream(high).max().getAsInt()));
    }
}