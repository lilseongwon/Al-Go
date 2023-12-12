import java.util.*;

public class Main {
    public String solution(String sen) {
        Stack<Character> stack = new Stack<>();

        for(char x : sen.toCharArray()) {
            if(x == '(') stack.push(x);
            else if(x == ')') {
                if(stack.isEmpty() || stack.peek() != '(') return "no";
                else stack.pop();
            }
            else if(x == '[') stack.push(x);
            else if(x == ']') {
                if(stack.isEmpty() || stack.peek() != '[') return "no";
                else stack.pop();
            }
        }
        if(stack.isEmpty()) return "yes";
        else return "no";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String sen = "";
        while (true) {
            sen = kb.nextLine();
            if (sen.equals(".")) {
                break;
            }
            System.out.println(T.solution(sen));
        }
    }
}