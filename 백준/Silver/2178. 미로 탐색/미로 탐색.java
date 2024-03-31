import java.util.Scanner;

public class Main {
    static int[][] arr;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int tx = 6;
    static int ty;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ty = kb.nextInt();
        tx = kb.nextInt();
        arr = new int[ty][tx];
        for(int i = 0; i < ty; i++) {
            String str = kb.next();
            for(int j = 0; j < tx; j++) {
                arr[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }
        DFS(0, 0, 1);
        System.out.println(arr[ty-1][tx-1]);
    }

    static void DFS(int x, int y, int cnt) {
        arr[y][x] = cnt;
        cnt++;
        for(int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if(nx >= 0 && nx < tx && ny >= 0 && ny < ty && (arr[ny][nx] == 1 || (arr[ny][nx] != 1 && arr[ny][nx] > cnt))) {
                DFS(nx, ny, cnt);
            }
        }
    }
}