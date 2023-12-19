import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = "";
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))) {
                str += s.charAt(i);
            }
            if (map.get(str) != null) {
                answer = answer * 10 + map.get(str);
                str = "";
            } else if (Character.isDigit(s.charAt(i))) {
                answer = answer * 10 + Character.getNumericValue(s.charAt(i));
            }
        }
        return answer;
    }

}