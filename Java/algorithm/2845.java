import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        num1 = num1 * num2;
        int a = scanner.nextInt() - num1;
        int b = scanner.nextInt() - num1;
        int c = scanner.nextInt() - num1;
        int d = scanner.nextInt() - num1;
        int e = scanner.nextInt() - num1;

        System.out.println(a +  " " + b + " " + c + " " + d + " " + e);
    }
}
