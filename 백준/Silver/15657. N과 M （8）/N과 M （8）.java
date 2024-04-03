import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] arr;
    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n+1];
        int[] answer = new int[m+1];
        for(int i = 1; i <= n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr);
        DFS(answer, 1, 0);
    }

    static void DFS(int[] answer, int index, int level) {
        if(level >= m) {
            for(int i = 1; i <= m; i++) {
                System.out.print(answer[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = index; i <= n; i++) {
            answer[level+1] = arr[i];
            DFS(answer, i, level+1);
        }
    }
}