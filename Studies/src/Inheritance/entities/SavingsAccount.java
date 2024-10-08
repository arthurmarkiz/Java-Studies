package Inheritance.entities;

public final class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount() {
        super();
    }
    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    // Sobrepor a função de saque nesse tipo de conta
    @Override
    public final void withdraw(double amount) {
        balance -= amount;
    }
}
