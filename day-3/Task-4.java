public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 5000) {
            System.out.println("Transaction cancelled. Max deposit - 5000 | Your deposit: " + amount);
            return;
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
        }
        System.out.println("Not enough funds");
    }

    public void printBalance() {
        System.out.println("Your bank account balance is: " + this.balance);
    }

    public void transfer(BankAccount toAccount, double amount) {
        if (this.balance < amount ) {
            System.out.println("Transfer cancelled. You are trying to transfer " + amount + " units, but only " + balance + " are available");
            return;
        }

        this.withdraw(amount);
        toAccount.deposit(amount);

    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(55);
        myAccount.withdraw(255);

        BankAccount offshoreAccount = new BankAccount(115000);
        offshoreAccount.deposit(16000);

        myAccount.transfer(offshoreAccount, 100);
    }
}

