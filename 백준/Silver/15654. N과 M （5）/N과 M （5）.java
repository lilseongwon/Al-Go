import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[] arr;
    static boolean[] checked;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        int[] answer = new int[m+1];
        arr = new int[n+1];
        checked = new boolean[n+1];
        for(int i = 1; i <= n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr);
        DFS(answer,  0);
    }

    static void DFS(int[] answer, int level) {
        if(level >= m) {
            for(int i = 1; i <= m; i++) {
                System.out.print(answer[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 1; i <= n; i++) {
            if(!checked[i]) {
                checked[i] = true;
                answer[level + 1] = arr[i];
                DFS(answer, level + 1);
                checked[i] = false;
            }
        }
    }
}
