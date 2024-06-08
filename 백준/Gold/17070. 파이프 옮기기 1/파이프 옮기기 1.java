import java.util.*;
public class Main {
    static int[] dx = {1, 1, 0}; //대각선 범위확인용
    static int[] dy = {0, 1, 1};
    static int[][] board;
    static int answer = 0;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        board = new int[n+1][n+1];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        DFS(Direction.GARO, 2, 1);
        System.out.println(answer);
    }

    static void DFS(Direction d, int x, int y) {
        if(x == board.length-1 && y == board.length-1) {
            answer++;
            return;
        }
        if(d != Direction.SERO) {
            if(x+1 < board.length && board[y][x+1] != 1) DFS(Direction.GARO, x+1, y);
        } if(d != Direction.GARO) {
            if(y+1 < board.length && board[y+1][x] != 1) DFS(Direction.SERO, x, y+1);
        }
        boolean daegak = true;
        for(int i = 0; i < 3; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if(!(nx < board.length && ny < board.length && board[ny][nx] == 0)) {

                daegak = false;
                break;
            }
        }
        if(daegak) {
            DFS(Direction.DAEGAK, x+1, y+1);
        }

    }


    enum Direction {
        GARO,
        SERO,
        DAEGAK
    }
}