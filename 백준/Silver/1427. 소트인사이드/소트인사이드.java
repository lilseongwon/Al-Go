import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[] arr = kb.next().toCharArray();
        Arrays.sort(arr);
        for(int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}