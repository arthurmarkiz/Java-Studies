package OOP;

import OOP.entities.Product;
import OOP.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Código com base na classe Triangle
//        Triangle x, y;
//        x = new Triangle();
//        y = new Triangle();
//
//        System.out.print("Coloque as medidas do triângulo X: ");
//        x.a = sc.nextDouble();
//        x.b = sc.nextDouble();
//        x.c = sc.nextDouble();
//
//        System.out.print("Coloque as medidas do triângulo Y: ");
//        y.a = sc.nextDouble();
//        y.b = sc.nextDouble();
//        y.c = sc.nextDouble();
//
//        double areaX = x.area();
//        double areaY = y.area();
//
//        System.out.println("Área do triangulo X: " + areaX);
//        System.out.println("Área do triangulo Y: " + areaY);

        // =========================================================
        // Código com base na classe Product

        Product faca = new Product("Faca de Cozinha", 17.20, 5);
        faca.displayProduct();
        System.out.println();
        faca.addProducts(6);
        faca.removeProducts(3);
        faca.setName("Faca Super Afiada - especial para cortar carne");
        faca.setPrice(21.65);
        faca.displayProduct();
    }
}
