import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for(int j = 0; j<i; j++) {
            String a = scanner.next();
            if(6 <= a.length() && a.length() <= 9)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
