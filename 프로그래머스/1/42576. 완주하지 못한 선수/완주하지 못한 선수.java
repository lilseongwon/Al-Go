import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> answer = new HashMap<>();

        for (String value : completion) {
            answer.put(value, answer.getOrDefault(value, 0) + 1);
        }

        for (String s : participant) {
            if (answer.getOrDefault(s, 0) == 0) return s;
            else answer.put(s, answer.get(s) - 1);
        }
        return null;
    }
}

