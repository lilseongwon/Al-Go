import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int M : moves) {
            for(int j = 0; j < board.length; j++) {
                if(board[j][M-1] > 0) {
                    if(!stack.isEmpty() && stack.peek() == board[j][M-1]) {
                        stack.pop();
                        answer+=2;
                    } else {
                        stack.push(board[j][M - 1]);
                    }
                    board[j][M-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}