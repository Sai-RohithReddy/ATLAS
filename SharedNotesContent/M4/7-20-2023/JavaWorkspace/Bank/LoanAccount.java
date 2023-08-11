package Bank;

class LoanAccount implements Account {
    private int balance;
    public int accNo;

    public LoanAccount(int accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    @Override
    public void viewBalance() {
        System.out.println("Current Loan amount: " + this.balance);
    }

    @Override
    public void credit(int amount) {
        this.balance -= amount;
        System.out.println(amount + " Credited.");
        viewBalance();
    }

    @Override
    public void debit(int amount) {
        System.out.println("Not allowed!!");
    }

}
