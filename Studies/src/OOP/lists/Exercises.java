package OOP.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados?: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println();
            System.out.printf("Funcionário #%d:%n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("ID já existe! Tente novamente: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.print("\nDigite o ID do funcionário que terá um aumento no salário: ");
        int idSalary = sc.nextInt();
        Integer pos = position(list, idSalary);
        if (pos == null) {
            System.out.println("Esse ID não existe!");
        } else {
            System.out.print("Digite a porcentagem de aumento: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("Lista de Funcionários: ");
        for (Employee emp : list) {
            System.out.println(emp);
        }
    }
    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
