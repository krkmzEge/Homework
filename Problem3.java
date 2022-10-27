//author EgeKorkmaz
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers:\n");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        System.out.println(a + " " + b + " " + c);

        if (a == b & b == c) {
            System.out.println(a + " " + b + " " + c);
        }
        else {
            if (a == b) {
                if (c > b) {
                    System.out.println(a + " " + b + " " + c);
                } else {
                    System.out.println(c + " " + b + " " + a);
                }
            }
            if (a == c) {
                if (c > b) {
                    System.out.println(b + " " + a + " " + c);
                } else {
                    System.out.println(c + " " + a + " " + b);
                }
            }
            if (b == c) {
                if (a > b) {
                    System.out.println(b + " " + c + " " + a);
                } else {
                    System.out.println(a + " " + c + " " + b);
                }
            }
            else {
                if ((a < b) && (b < c)) {
                    System.out.println(a + " " + b + " " + c);
                }
                if ((a < b) && (b > c)) {
                    System.out.println(a + " " + c + " " + b);
                }
                if ((a > b) && (b > c)) {
                    System.out.println(c + " " + b + " " + a);
                }
                if ((a > b) && (b < c)) {
                    System.out.println(b + " " + a + " " + c);
                }
            }
        }
    }
}