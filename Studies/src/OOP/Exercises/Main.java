package OOP.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exercicio 1 (Rectangle Class):
//        System.out.print("Digite a base e a altura de um retângulo: ");
//        double width = sc.nextDouble();
//        double height = sc.nextDouble();
//        Rectangle myRectangle = new Rectangle(width, height);
//        myRectangle.recInfos();

        // Exercicio 2: (Student Class)
        System.out.print("Digite o nome do aluno: ");
        String studentName = sc.nextLine();
        System.out.print("Digite suas respectivas notas (1a 2a 3a): ");
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        double third = sc.nextDouble();
        Student student1 = new Student(studentName, first, second, third);
        student1.displayResult();
    }
}
