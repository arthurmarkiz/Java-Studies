package Basics;

import java.util.Locale;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        // Exercise 01:
//        int n1, n2, add;
//        n1 = sc.nextInt();
//        n2 = sc.nextInt();
//        add = n1 + n2;
//        System.out.printf("SOMA = %d%n", add);

        // Exercise 02:
//        double radius, area;
//        radius = sc.nextDouble();
//        area = Math.PI * Math.pow(radius, 2);
//        System.out.printf("A= %.4f%n", area);

        // Exercise 03:
//        int A, B, C, D, dif;
//        A = sc.nextInt();
//        B = sc.nextInt();
//        C = sc.nextInt();
//        D = sc.nextInt();
//        dif = (A * B - C * D);
//        System.out.printf("Difference = %d%n", dif);

        // Exercise 04:
//        int number, hours;
//        double valuePerHour, salary;
//        number = sc.nextInt();
//        hours = sc.nextInt();
//        valuePerHour = sc.nextDouble();
//        salary = hours * valuePerHour;
//        System.out.printf("NUMBER = %s%n", number);
//        System.out.printf("SALARY = U$ %.2f", salary);

        // Exercise 05:
//        int code1, code2, qty1, qty2;
//        double price1, price2, total;
//        code1 = sc.nextInt();
//        qty1 = sc.nextInt();
//        price1 = sc.nextDouble();
//        code2 = sc.nextInt();
//        qty2 = sc.nextInt();
//        price2 = sc.nextDouble();
//        total = (qty1 * price1 + qty2 * price2);
//        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        // Exercise 06:
        double A, B, C;
        double triangleArea, circleArea, trapezeArea, squareArea, rectangleArea;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        triangleArea = (A * C) / 2;
        circleArea = Math.PI * Math.pow(C, 2);
        trapezeArea = ((A + B) * C) / 2;
        squareArea = B * B;
        rectangleArea = A * B;
        System.out.printf("TRIANGULO: %.3f%n", triangleArea);
        System.out.printf("CIRCULO: %.3f%n", circleArea);
        System.out.printf("TRAPEZIO: %.3f%n", trapezeArea);
        System.out.printf("QUADRADO: %.3f%n", squareArea);
        System.out.printf("RETANGULO: %.3f%n", rectangleArea);

    }
}
