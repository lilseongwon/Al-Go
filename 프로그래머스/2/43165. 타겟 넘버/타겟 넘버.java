import java.util.*;

class Solution {
    static int cnt = 0;
    static int t;
    public int solution(int[] numbers, int target) {
        t = target;
        DFS(numbers, 0, 0);
        return cnt;
    }
    
        static void DFS(int[] arr, int level, int sum) {
        if(level >= arr.length) {
            if(sum == t) cnt++;
            return;
        }
        DFS(arr, level+1, sum-arr[level]);
        DFS(arr, level+1, sum+arr[level]);
    }
}