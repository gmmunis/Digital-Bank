public abstract class Account implements IAccount {

    private static final int DEFAULT_BRANCH = 1;
    private static int SEQUENTIAL = 1;

    protected int branch;
    protected int number;
    protected double balance;
    protected  Client client;

    public Account(Client client) {
        this.branch = Account.DEFAULT_BRANCH;
        this.number = SEQUENTIAL++;
        this.client = client;
    }

    @Override
    public void withdrawal(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, IAccount accountHolder) {
        this.withdrawal(value);
        accountHolder.withdrawal(value);
    }

    public int getBranch() {
        return branch;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    protected void printCommonInformation() {
        System.out.println(String.format("AccountHolder: %s", this.client.getName()));
        System.out.println(String.format("Branch: %d", this.branch));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
    }
}
