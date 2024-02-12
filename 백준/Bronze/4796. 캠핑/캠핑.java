import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = 0;
        while(true) {
            int answer = 0;
            int L = kb.nextInt();
            int P = kb.nextInt();
            int V = kb.nextInt();
            if(L == P && P == V && V == 0) {
                break;
            } else {
                while(V >= P) {
                    V-=P;
                    answer+=L;
                }
                while(V > 0 && L > 0) {
                    answer++;
                    V--;
                    L--;
                }
            }
            count++;
            System.out.println("Case " + count + ": " + answer);
        }
    }
}