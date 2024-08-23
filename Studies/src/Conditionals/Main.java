package Conditionals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Que horas são agora? (24h): ");
//        int hours = sc.nextInt();
//
//        if (hours <= 12 && hours >= 6)
//            System.out.println("Bom dia!");
//        else if (hours > 12 && hours <= 18)
//            System.out.println("Boa tarde!");
//        else {
//            System.out.println("Boa noite!");
//        }
//        sc.close();

        // If ternary
        // ( 2 > 4) ? "Maria" : "Alex" -----> "Alex"

        // Switch Case
        int x = sc.nextInt();
        String day;

        switch (x) {
            case 1:
                day = "domingo";
                break;
            case 2:
                day = "segunda";
                break;
            case 3:
                day = "terça";
                break;
            case 4:
                day = "quarta";
                break;
            case 5:
                day = "quinta";
                break;
            case 6:
                day = "sexta";
                break;
            case 7:
                day = "sabado";
                break;
            default:
                day = "Valor invalido!";
                break;
        }
        System.out.println("Dia da semana: " + day);
        sc.close();
    }
}
