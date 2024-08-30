package basicPart1;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int n2 = sc.nextInt();

        System.out.printf("%d + %d = %d%n", n1, n2, n1 + n2);
        System.out.printf("%d - %d = %d%n", n1, n2, n1 - n2);
        System.out.printf("%d x %d = %d%n", n1, n2, n1 * n2);
        System.out.printf("%d / %d = %d%n", n1, n2, n1 / n2);
        System.out.printf("%d mod %d = %d%n", n1, n2, n1 % n2);
    }
}
