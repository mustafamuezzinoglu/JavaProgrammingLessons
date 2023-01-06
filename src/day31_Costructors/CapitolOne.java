package day31_Costructors;

public class CapitolOne {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet Ozkok",123456789);
        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();
        System.out.println("---------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun Ozkok",987654321);
        System.out.println(account2);

        account2.deposit(10000);
        account2.checkBalance();

        account2.withdraw(900);
        account2.checkBalance();
        System.out.println("---------------------------------");





    }
}
