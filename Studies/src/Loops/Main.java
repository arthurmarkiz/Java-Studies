package Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // while
//        System.out.println("Digite 0 para sair.");
//        System.out.println("Continue digitando números para somar: ");
//
//        int x = sc.nextInt();
//        int total = 0;
//
//        while (x != 0) {
//            total += x;
//            x = sc.nextInt();
//        }
//        System.out.println("Total: " + total);
//        sc.close();

        // for
        System.out.print("Digite quantos valores serão somados: ");
        int length = sc.nextInt();
        int total = 0;
        for (int i = 0; i < length; i++) {
            System.out.print("Digite um número: ");
            int n = sc.nextInt();
            total += n;
        }
        System.out.println("Total: " + total);
    }
}
