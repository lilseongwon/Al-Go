import java.util.*;

public class Main {
    static long answer = Integer.MAX_VALUE;
    static long end;
    static Set<Long> check = new HashSet<>();
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        long start = kb.nextInt();
        end = kb.nextInt();
        DFS(start, 1);
        if(answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }

    static void DFS(long num, long cnt) {
        if(num == end) {
            answer = Math.min(answer, cnt);
            return;
        }
        if(check.contains(num)) return;
        check.add(num);
        if(num*2 <= end) {
            DFS(num*2, cnt+1);
        }
        if(num*10+1 <= end) {
            DFS(num*10+1, cnt+1);
        }
    }
}