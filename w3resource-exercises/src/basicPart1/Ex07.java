package basicPart1;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        long n = sc.nextLong();

        System.out.println("The sum of the digits is: " + sumDigits(n));
    }
    public static int sumDigits(long n) {
        int sum = 0;

        while (n != 0) {
            sum += (int) n % 10;
            n /= 10;
        }
        return sum;
    }
}
