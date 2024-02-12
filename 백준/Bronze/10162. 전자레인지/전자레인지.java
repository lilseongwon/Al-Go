import java.util.Scanner;

public class Main {
    static int[] stand = {300, 60, 10};

    public static void main(String[] args) {
        int answer = 0;
        Scanner kb = new Scanner(System.in);
        int time = kb.nextInt();
        if (time % 10 != 0) System.out.println(-1);
        else {
            for (int i = 0; i < 3; i++) {
                answer = 0;
                while (stand[i] <= time) {
                    time -= stand[i];
                    answer++;
                }
                System.out.print(answer + " ");
            }
        }
    }
}