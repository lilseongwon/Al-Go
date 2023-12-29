import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] rooms = new int[N+1];
        int M = kb.nextInt();
        int[] cars = new int[M+1];
        for(int i = 1; i <= N; i++) {
            rooms[i] = kb.nextInt();
        }
        for(int j = 1; j <= M; j++) {
            cars[j] = kb.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> indexes = new TreeSet<>();
        Queue<Integer> Q = new LinkedList<>();
        Queue<Integer> wait =  new LinkedList<>();
        for(int i = 1; i <= N; i++) {
            indexes.add(i);
        }
        int answer = 0;
        for(int i = 0; i < 2*M; i++) {
            Q.offer(kb.nextInt());
        }
        while(!Q.isEmpty()) {
            if(Q.peek() > 0 && !indexes.isEmpty()) {
                int index = indexes.first();
                indexes.remove(index);
                int car = Q.poll();
                answer+=(rooms[index] * cars[car]);
                map.put(car, index);
            }

            else if(Q.peek() < 0) {
                int out = Q.poll();
                int x = map.get(out*-1);
                indexes.add(x);
                map.remove(out);
                if(!wait.isEmpty()) {
                    int index = indexes.first();
                    indexes.remove(index);
                    int car = wait.poll();
                    answer+=(rooms[index] * cars[car]);
                    map.put(car, index);
                }
            }
             else {
                wait.offer(Q.poll());
            }
        }
        System.out.println(answer);
    }
}