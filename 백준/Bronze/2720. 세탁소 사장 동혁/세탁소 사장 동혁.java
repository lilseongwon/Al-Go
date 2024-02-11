import java.util.Scanner;

public class Main {
    static int[] stand = {25, 10, 5, 1};
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int i = 0; i < n; i++) {
            int answer = 0;
            int d = kb.nextInt();
            for(int j = 0; j < 4; j++) {
                while(stand[j] <= d) {
                    d -= stand[j];
                    answer++;
                }
                System.out.print(answer + " ");
                answer = 0;
            }
            System.out.println();
        }
    }
}