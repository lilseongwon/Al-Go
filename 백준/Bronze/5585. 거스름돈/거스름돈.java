import java.util.Scanner;

public class Main {
    static int[] stand = {500, 100, 50, 10, 5, 1};

    public static void main(String[] args) {
        int answer = 0;
        Scanner kb = new Scanner(System.in);
        int jandon = (1000 - kb.nextInt());
        for(int x : stand) {
            while(x <= jandon) {
                jandon-=x;
                answer++;
            }
        }
        System.out.println(answer);
    }
}