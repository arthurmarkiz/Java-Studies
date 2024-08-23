package Loops;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // EXERCICIOS WHILE

        // Exercicio 1:
//        int password = 2002;
//        int userInput = 0;
//
//        while (userInput != password) {
//            userInput = sc.nextInt();
//            if (userInput != password)
//                System.out.println("Senha inválida");
//        }
//        System.out.println("Acesso permitido");
//        sc.close();

        // Exercicio 2:
//        String q1 = "primeiro";
//        String q2 = "segundo";
//        String q3 = "terceiro";
//        String q4 = "quarto";
//
//        boolean is_looping = true;
//        while (is_looping) {
//            System.out.print("Digite a coordenada X: ");
//            int X = sc.nextInt();
//            System.out.print("Digite a coordenada Y: ");
//            int Y = sc.nextInt();
//            if (X == 0 || Y == 0) {
//                is_looping = false;
//            }
//            else if (X > 0 && Y > 0)
//                System.out.println(q1);
//            else if (X < 0 && Y > 0)
//                System.out.println(q2);
//            else if (X < 0)
//                System.out.println(q3);
//            else {
//                System.out.println(q4);
//            }
//        }
//        sc.close();

        // Exercicio 3:
//        int alcoolCode = 1, gasolineCode = 2, dieselCode = 3, exit = 4;
//        int alcoolQty = 0, gasolineQty = 0, dieselQty = 0;
//        int userInput = 0;
//
//        while (userInput != exit) {
//            userInput = sc.nextInt();
//            if (userInput == alcoolCode)
//                alcoolQty += 1;
//            else if (userInput == gasolineCode)
//                gasolineQty += 1;
//            else if (userInput == dieselCode)
//                dieselQty += 1;
//        }
//        System.out.println("MUITO OBRIGADO");
//        System.out.println("Alcool: " + alcoolQty);
//        System.out.println("Gasolina: " + gasolineQty);
//        System.out.println("Diesel: " + dieselQty);
//        sc.close();

        // ===============================================================
        // EXERCICIOS FOR

        // Exercicio 1:
//        int x = sc.nextInt();
//        for (int i = 0; i < x; i++) {
//            if (i % 2 != 0)
//                System.out.println(i);
//        }
//        sc.close();

        // Exercicio 2:
//        System.out.print("Digite quantos números serão lidos: ");
//        int N = sc.nextInt();
//        int in = 0;
//        int out = 0;
//
//        for (int i = 0; i < N; i++) {
//            System.out.print("Digite um número: ");
//            int num = sc.nextInt();
//            if (num >= 10 && num <= 20)
//                in += 1;
//            else {
//                out += 1;
//            }
//        }
//        System.out.println("Intervalo [10, 20]:");
//        System.out.println(in + " in");
//        System.out.println(out + " out");
//        sc.close();

        // Exercicio 3:
//        int N = sc.nextInt();
//        int factorial = 1;
//        for (int i = 1; i <= N; i++) {
//            factorial *= i;
//        }
//        System.out.println(factorial);
//        sc.close();

        // Exercicio 4:
//        int N = sc.nextInt();
//        for (int i = 1; i <= N; i++) {
//            if (N % i == 0)
//                System.out.println(i);
//        }
//        sc.close();
    }
}
