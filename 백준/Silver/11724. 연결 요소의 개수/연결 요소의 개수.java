import java.util.Scanner;

public class Main {
    static int[][] graph = new int[1001][1001];
    static boolean[] visited = new boolean[1001];
    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
         n = kb.nextInt();
         m = kb.nextInt();

        for(int i = 1; i <= m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = graph[b][a] = 1;
        }
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(!visited[i]) {
                DFS(i);
                answer++;
            }
        }
        System.out.println(answer);
    }

    static void DFS(int num) {
        if(visited[num]) return;
        visited[num] = true;
        for(int i = 1; i <= n; i++) {
            if(graph[num][i] == 1) {
                DFS(i);
            }
        }
    }
}