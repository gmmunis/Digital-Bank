public abstract class Account implements IAccount {

    protected int branch;
    protected int number;
    protected double balance;

    public Account() {
        super();
    }

    @Override
    public void withdrawal(double value) {}

    @Override
    public void deposit(double value) {}

    @Override
    public void transfer(double value, Account accountHolder) {}

    public int getBranch() {
        return branch;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
}
