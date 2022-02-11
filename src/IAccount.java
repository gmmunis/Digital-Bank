public interface IAccount {

    void withdrawal(double value);
    void deposit(double value);
    void transfer(double value, Account accountHolder);
}
