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
    static int[] dis;

    static void dijkstra(int n, int start) {
        int INF = 1000000000;
        boolean[] check = new boolean[n+1];
        dis = new int[n+1];

        Arrays.fill(dis, INF);

        dis[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));

        while(!pq.isEmpty()) {
            int nowVertext = pq.poll().index;

            if(check[nowVertext]) continue;
            check[nowVertext] = true;

            for(Node next : graph[nowVertext]) {
                if(dis[next.index] > dis[nowVertext] + next.cost) {
                    dis[next.index] = dis[nowVertext] + next.cost;
                    pq.offer(new Node(next.index, dis[next.index]));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        graph = new ArrayList[n+1];
        for(int i = 0; i <= n; i++) graph[i] = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            int start = kb.nextInt();
            int end = kb.nextInt();
            int cost = kb.nextInt();
            graph[start].add(new Node(end, cost));
        }
        int start = kb.nextInt();
        int end = kb.nextInt();
        dijkstra(n, start);
        System.out.println(dis[end]);
    }
}