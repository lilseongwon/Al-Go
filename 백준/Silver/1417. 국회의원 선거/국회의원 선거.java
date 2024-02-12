import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int dasom = kb.nextInt();
        int answer = 0;
        PriorityQueue<Integer> Q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 1; i < n; i++) {
            Q.offer(kb.nextInt());
        }
        while(!Q.isEmpty()) {
            int tmp = Q.poll();
            if(dasom <= tmp) {
                answer++;
                dasom++;
                Q.offer(--tmp);
            } else break;
        }
        System.out.println(answer);
    }
}