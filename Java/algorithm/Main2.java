import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        scanner.close();

        if(a-b > 0) {
            System.out.println(a-b);
        }
        else
            System.out.println((a-b)*-1);
    }
}
