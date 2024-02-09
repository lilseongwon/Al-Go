import java.util.*;

class Value {
    int x;
    int y;

    public Value(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int x;
    static int y;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        x = kb.nextInt();
        y = kb.nextInt();
        Queue<Value> Q = new LinkedList<>();
        int[][] arr = new int[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                int tmp = kb.nextInt();
                arr[i][j] = tmp;
                if (tmp > 0) Q.add(new Value(j, i));
            }
        }
        int sum = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            int cnt = 0;
            for (int i = 0; i < len; i++) {
                Value value = Q.poll();
                if (value.x - 1 >= 0 && arr[value.y][value.x - 1] == 0) {
                    arr[value.y][value.x-1] = 1;
                    Q.offer(new Value(value.x - 1, value.y));
                    cnt = 1;
                }
                if (value.x + 1 < x && arr[value.y][value.x + 1] == 0) {
                    arr[value.y][value.x+1] = 1;
                    Q.offer(new Value(value.x + 1, value.y));
                    cnt = 1;
                }
                if (value.y + 1 < y && arr[value.y + 1][value.x] == 0) {
                    arr[value.y + 1][value.x] = 1;
                    Q.offer(new Value(value.x, value.y + 1));
                    cnt = 1;
                }
                if (value.y - 1 >= 0 && arr[value.y-1][value.x] == 0) {
                    arr[value.y-1][value.x] = 1;
                    Q.offer(new Value(value.x, value.y - 1));
                    cnt = 1;
                }
            }
            sum += cnt;
        } // cnt 0이면 원래 익은거, 아니면 -1 제외하고 0이 하나라도 있으면 -1 출력, 전부 익어있으면 cnt 출력
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (arr[j][i] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(sum);
    }
}