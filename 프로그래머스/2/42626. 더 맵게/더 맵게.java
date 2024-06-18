import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i : scoville) {
            queue.offer(i);
        }
        while(queue.size() >= 2 && queue.peek() < K) {
            queue.offer(queue.poll() + queue.poll() * 2);
            answer++;
        }
        if(!queue.isEmpty() && queue.peek() < K) {
            return -1;
        }
        return answer;
    }
}