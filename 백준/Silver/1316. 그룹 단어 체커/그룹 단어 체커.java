import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int answer = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            String tmp = kb.next();
            int cnt = 1;
            for(int j = 0; j < tmp.length(); j++) {
                if(j >= 1 && tmp.charAt(j-1) != tmp.charAt(j) && set.contains(tmp.charAt(j))) {
                    cnt = 0;
                    break;
                }
                set.add(tmp.charAt(j));
            }
            answer += cnt;
            set.clear();
        }
        System.out.println(answer);
    }
}