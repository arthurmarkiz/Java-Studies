package Basics;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String name = "Arthur";
        char gender = 'M';
        int y = 20;
        System.out.printf("name: %s, gender: %c, age: %d%n", name, gender, y);

        double result = 10.1416;
        System.out.printf("Result = %.2f cm%n", result);

        // Scanner: Entries
        Scanner sc = new Scanner(System.in);
        char x;
        x = sc.next().charAt(0);
        System.out.println("You typed: " + x);
        sc.close();

        // Math Functions
        double A, B, C;
        A = Math.sqrt(4.0);
        B = Math.abs(-25);
        C = Math.pow(2, 2);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}