public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public String printBalance() {
        return "Your bank account balance: " + this.balance;
    }

    public void transfer(BankAccount account, double amount) {
        this.withdraw(amount);
        account.deposit(amount);
    }
}

