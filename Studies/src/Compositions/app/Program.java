package Compositions.app;

import Compositions.entities.Department;
import Compositions.entities.HourContract;
import Compositions.entities.Worker;
import Compositions.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String departmentName = sc.nextLine();
        System.out.println("Preencha os dados do trabalhador:");
        System.out.print("Nome: ");
        String workerName = sc.nextLine();
        System.out.print("Nível: ");
        String workerLevel = sc.nextLine();
        System.out.print("Salário Base: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println();
        System.out.print("Quantos contratos esse trabalhador tem?: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Preencha os dados do contrato #%d%n", i + 1);
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duração (horas): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Digite o mês e o ano para calcular a renda (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 1));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println();
        System.out.printf("Nome: %s%n", worker.getName());
        System.out.printf("Departamento: %s%n", worker.getDepartment());
        System.out.printf("Renda em %s: R$%.2f%n", monthAndYear, worker.income(year, month));

        sc.close();
    }
}
