import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[] arr;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        Set<Integer> set = new HashSet<>();
        int[] answer = new int[m+1];
        for(int i = 0; i < n; i++) {
            set.add(kb.nextInt());
        }
        arr = new int[set.size()+1];
        int i = 1;
        for(int tmp : set) {
            arr[i] = tmp;
            i++;
        }
        Arrays.sort(arr);
        DFS(answer, 1, 0);
    }

    static void DFS(int[] answer, int index, int level) {
        if(level >= m) {
            for(int i = 1; i <= m; i++) {
                System.out.print(answer[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = index; i < arr.length; i++) {
            answer[level+1] = arr[i];
            DFS(answer, i, level+1);
        }
    }
}