public interface IAccount {

    void withdrawal(double value);
    void deposit(double value);
    void transfer(double value, IAccount accountHolder);
    void printBankStatement();
}
