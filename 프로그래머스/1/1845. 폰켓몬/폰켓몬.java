import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int tmp = nums.length / 2;
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        return Math.min(set.size(), tmp);
    }
}