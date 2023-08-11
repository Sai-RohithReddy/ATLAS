package Bank;

class SavingsAccount implements Account {
    private int balance;
    public int accNo;

    public SavingsAccount(int accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    @Override
    public void viewBalance() {
        System.out.println("Current balance: " + this.balance);
    }

    @Override
    public void credit(int amount) {
        this.balance += amount;
        System.out.println(amount + " Credited.");
        viewBalance();
    }

    @Override
    public void debit(int amount) {
        if (this.balance >= amount) {
            System.out.printf("Collect amount: %d/-\n", amount);
            this.balance -= amount;
        } else {
            System.out.println("Insufficient fund!!");
        }
    }

}
