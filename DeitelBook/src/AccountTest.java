package src;

import java.util.Locale;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Account account1 = new Account("Arthur", 200.0);
        Account account2 = new Account("Ana", 0.0);

        account1.setName("Arthur Markiz");
        account1.deposit(50.50);
        account2.deposit(120.0);

        System.out.printf("name: %s / Balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("name: %s / Balance: $%.2f%n", account2.getName(), account2.getBalance());

        sc.close();
    }
}
