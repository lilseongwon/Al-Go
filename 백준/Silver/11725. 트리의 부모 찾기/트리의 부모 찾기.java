import java.util.*;

public class Main {
    static Set<Integer>[] arr;
    static int[] answer;
    static int n;
    static boolean[] isVisit;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new Set[n + 1];
        answer = new int[n + 1];
        isVisit = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            arr[i] = new HashSet<>();
        }

        for (int i = 2; i <= n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            arr[a].add(b);
            arr[b].add(a);
        }
        DFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(answer[i]);
        }
    }

    static void DFS(int index) {
        isVisit[index] = true;
        for (int i : arr[index]) {
            if (!isVisit[i]) {
                answer[i] = index;
                DFS(i);
            }
        }
    }
}
