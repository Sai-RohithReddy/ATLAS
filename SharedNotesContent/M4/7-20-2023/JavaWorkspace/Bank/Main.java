package Bank;

public class Main {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount(123, 10000);
        Account a2 = new LoanAccount(111, 5000);

        a1.viewBalance();
        a1.credit(5000);
        a1.debit(100);

        a2.viewBalance();
        a2.credit(2000);

    }
}
