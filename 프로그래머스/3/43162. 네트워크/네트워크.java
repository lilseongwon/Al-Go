import java.util.*;

class Solution {
    static int[][] arr;
    public int solution(int n, int[][] computers) {
        arr = computers;
        int answer = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(computers[i][j] == 1) {
                    answer++;
                    DFS(i);
                }
            }
        }
        return answer;
    }
    
    public void DFS(int p) {
        arr[p][p] = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[p][i] == 1) {
                arr[i][p] = 0;
                arr[p][i] = 0;
                DFS(i);
            }
        }
    }
}