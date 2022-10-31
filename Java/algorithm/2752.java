import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = 0;
        int mid = 0;
        int min = 0;
        if(a > b && a > c) {
            max = a;
            mid = Math.max(b, c);
            min = Math.min(b, c);
        } else if(b > a && b > c) {
            max = b;
            mid = Math.max(a, c);
            min = Math.min(a, c);
        } else if(c > b && c > a) {
            max = c;
            mid = Math.max(a, b);
            min = Math.min(a, b);
        }
        System.out.println(min + " " + mid + " " + max);
    }
}
