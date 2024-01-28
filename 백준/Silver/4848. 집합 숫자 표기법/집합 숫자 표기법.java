import java.util.*;
public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        HashMap<String, Integer> sMap = new HashMap<>();
        String[] arr = new String[16];
        arr[0] = "{}";
        sMap.put(arr[0], 0);
        for(int i = 1; i <= 15; i++) {
            String tmp = "";
            tmp+="{";
            for(int j = 0; j < i; j++) {
                tmp+=arr[j];
                if(j < i-1) {
                    tmp+=",";
                }
            }
            tmp+="}";
            arr[i] = tmp;
            sMap.put(arr[i], i);
        }
        int n = kb.nextInt();
        for(int i = 0; i < n; i++) {
            String a = kb.next();
            String b = kb.next();
            System.out.println(arr[sMap.get(a)+sMap.get(b)]);
        }
    }
}