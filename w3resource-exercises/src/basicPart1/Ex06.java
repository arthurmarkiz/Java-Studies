package basicPart1;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        final double PI = Math.PI;

        System.out.print("Digite o raio de um circulo: ");
        double radius = sc.nextDouble();

        double perimeter = 2 * PI * radius;
        double area = PI * Math.pow(radius, 2);

        System.out.printf("Perimetro: %.2f%n", perimeter);
        System.out.printf("Area: %.2f%n", area);

    }


}
