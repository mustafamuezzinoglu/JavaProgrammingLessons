package day31_Costructors;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance() {
        System.out.println("Your available balance is : " + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Depositing amount can not be zero or negative");
            return; // exist the method
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawing amount can not be zero or negative");
            return; // exist the method
        }
        balance -= amount;

    }
}
