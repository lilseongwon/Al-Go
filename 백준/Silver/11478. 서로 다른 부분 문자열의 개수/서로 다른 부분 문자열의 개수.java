import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public int solution(String s) {
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            String str = "";
            str+=s.charAt(i);
            set.add(str);
            for(int j = i+1; j < s.length(); j++) {
                str+=s.charAt(j);
                set.add(str);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}