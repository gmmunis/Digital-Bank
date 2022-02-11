public abstract class Account implements IAccount {

    private static final int DEFAULT_BRANCH = 1;
    private static int SEQUENTIAL = 1;

    protected int branch;
    protected int number;
    protected double balance;

    public Account() {
        this.branch = DEFAULT_BRANCH;
        this.number = SEQUENTIAL++;
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
