package Inheritance;

import Inheritance.entities.Account;
import Inheritance.entities.BusinessAccount;
import Inheritance.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        // Upcasting
        Account acc1 = new BusinessAccount(100, "Arthur", 0.0, 1000.0);
        Account acc2 = new BusinessAccount(200, "Ana", 0.0, 500.0);
        Account acc3 = new SavingsAccount(300, "Maria", 0.0, 0.01);

        // Downcasting
//      BusinessAccount bacc2 = (BusinessAccount) new Account();
//      BusinessAccount bacc3 = (BusinessAccount) sacc; // Isso irá gerar um erro na hora da compilação
    }
}
