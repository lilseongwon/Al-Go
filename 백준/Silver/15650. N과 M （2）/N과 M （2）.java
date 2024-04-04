import java.util.*;

public class Main {
    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        int[] answer = new int[m+1];
        DFS(answer, 0, 0);
    }

    static void DFS(int[] answer, int index, int level) {
        if(level >= m) {
            for(int i = 1; i <= m; i++) {
                System.out.print(answer[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = index+1; i <= n; i++) {
            answer[level+1] = i;
            DFS(answer, i, level+1);
        }
    }
}