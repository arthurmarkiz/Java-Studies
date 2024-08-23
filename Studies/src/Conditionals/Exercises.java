package Conditionals;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercicio 1:
//        System.out.print("Type a integer number: ");
//        int num = sc.nextInt();
//        if (num >= 0)
//            System.out.println("NÃO NEGATIVO");
//        else {
//            System.out.println("NEGATIVO");
//        }
//        sc.close();

        // Exercicio 2:
//        System.out.print("Type a integer number: ");
//        int num = sc.nextInt();
//        if (num % 2 == 0)
//            System.out.println("PAR");
//        else {
//            System.out.println("IMPAR");
//        }
//        sc.close();

        // Exercicio 3:
//        System.out.print("Type two integer number: ");
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        if (A % B == 0 || B % A == 0)
//            System.out.println("Sao Multiplos");
//        else {
//            System.out.println("Nao Sao Multiplos");
//        }
//        sc.close();

        // Exercicio 4:
        System.out.print("Que horas começou? Que horas acabou? (24h): ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int duration;
        if (start < end) {
            duration = end - start;
        }
        else {
            duration = 24 - start + end;
        }
        System.out.printf("O JOGO DUROU %d HORA(S).", duration);
        sc.close();
    }
}
