import java.util.*;

class Node implements Comparable<Node> {
    int index;
    int cost;

    Node(int index, int cost) {
        this.index = index;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.cost, o.cost);
    }
}

public class Main {
    static ArrayList<Node>[] graph;
    static int INF = 10000000;
    static int dis[];
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int start = kb.nextInt();
        graph = new ArrayList[n+1];
        for(int i = 0; i <= n; i++) graph[i] = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            int u = kb.nextInt();
            int v = kb.nextInt();
            int w = kb.nextInt();
            graph[u].add(new Node(v, w));
        }

        dijkstra(n, start);
        for(int i = 1; i <= n; i++) {
            if(dis[i] == INF) System.out.println("INF");
            else System.out.println(dis[i]);
        }
    }

    static void dijkstra(int n, int start) {
        boolean[] check = new boolean[n+1];
        dis = new int[n+1];
        Arrays.fill(dis, INF);

        dis[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));

        while(!pq.isEmpty()) {
            int nowIndex = pq.poll().index;
            if(check[nowIndex]) continue;
            check[nowIndex] = true;

            for(Node next : graph[nowIndex]) {
                if(dis[next.index] > dis[nowIndex] + next.cost) {
                    dis[next.index] = dis[nowIndex] + next.cost;
                    pq.offer(new Node(next.index, dis[next.index]));
                }
            }
        }
    }
}