import java.util.*;

public class Main {
    public int solution(String str) {
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] == '(') {
                if (arr[i + 1] == ')') {
                    answer += stack.size();
                } else {
                    stack.push(arr[i]);
                }
            } else if (arr[i - 1] == ')') {
                answer+=1;
                stack.pop();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}