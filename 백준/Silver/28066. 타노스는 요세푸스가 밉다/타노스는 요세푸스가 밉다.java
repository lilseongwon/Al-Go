import java.util.*;
public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int K = kb.nextInt();
        System.out.println(T.solution(N, K));
    }

    public int solution(int N, int K) {
        Queue<Integer> Q = new LinkedList<>();
        for(int i = 1; i <= N; i++) {
            Q.offer(i);
        }
        while(!Q.isEmpty()) {
            if(Q.size() < K || Q.size() == 1) {
                return Q.poll();
            }
            Q.offer(Q.poll());
            for(int i = 0; i < K-1; i++) {
                Q.poll();
            }
        }
        return 0;
    }
}