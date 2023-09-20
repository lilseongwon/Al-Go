import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        ArrayList<Character> list = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if(list.size() == 0 && character == ')') {
                return false;
            }
            if(character == ')') {
                if(list.get(list.size()-1) != '(')
                    return false;
                else {
                    list.remove(list.size()-1);
                    continue;
                }
            }
            list.add(character);
        }
        if(list.size() >= 1)
            answer = false;
        
        return answer;
    }
}