import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String name = scanner.next();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(name.equals("#") && a == 0 && b == 0)
                break;
            if(a > 17 || b >= 80)
                System.out.println(name + " Senior");
            else {
                System.out.println(name + " Junior");
            }
        }
    }
}
