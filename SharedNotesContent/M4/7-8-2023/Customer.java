interface RBI {
    void personalLoan();

    void goldLoan();
}

class Account {

    private int balance;

    public void credit(int amt) {
        balance += amt;
    }

    public void debit(int amt) {
        balance -= amt;
    }

    public void getBalance() {
        System.out.println(balance);
    }
}

class ICICI extends Account implements RBI {

    @Override
    public void personalLoan() {
        System.out.println("10.75% p.a. - 19.00% p.a.");
    }

    @Override
    public void goldLoan() {
        System.out.println("11.75% p.a. - 20.00% p.a.");
    }

}

class HSBC extends Account implements RBI {

    @Override
    public void personalLoan() {
        System.out.println("9.99% p.a. - 16.00% p.a.");
    }

    @Override
    public void goldLoan() {
        System.out.println("11% p.a. to 16% p.a.");
    }
}

public class Customer {
    public static void main(String[] args) {
        ICICI icici = new ICICI();
        HSBC hsbc = new HSBC();

        icici.credit(100);
        icici.getBalance();
        icici.debit(50);

        icici.getBalance();
        hsbc.getBalance();

        icici.personalLoan();
        hsbc.personalLoan();

    }
}
