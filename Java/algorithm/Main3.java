import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        scanner.close();
        b = a * b * 0.01;
        if(a - b >= 100) {
            System.out.println(0);
        } else
            System.out.println(1);
    }
}
