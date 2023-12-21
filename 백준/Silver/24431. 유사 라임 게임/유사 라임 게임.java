import java.util.*;

class Main {
public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int cnt;
        int t = kb.nextInt();
        while(t > 0) {
        HashSet<String> set = new HashSet<>();
            cnt = 0;
            int n = kb.nextInt();
            int l = kb.nextInt();
            int f = kb.nextInt();
            while(n > 0) {
                String s = kb.next();
                int len = s.length();
                String sub = s.substring(len-f, len);
                if(set.contains(sub)) {
                    set.remove(sub);
                    cnt++;
                } else {
                    set.add(sub);
                }
                n--;
            }
            t--;
            System.out.println(cnt);
        }
    }
}