import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int good = 7;
        int bad = 7;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < win_nums.length; i++) {
            set.add(win_nums[i]);
        }
        
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0)
                good--;
            else if(set.contains(lottos[i])) {
                good--;
                bad--;
            }
        }
        if(good == 7) good = 6;
        if(bad == 7) bad = 6;
        
        int[] answer = {good, bad};
        return answer;
    }
}