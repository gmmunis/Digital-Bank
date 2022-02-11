public class Main {

    public static void main(String[] args) {

        Client accountHolder = new Client();
        accountHolder.setName("Guilherme");

        IAccount cc = new CheckingAccount(accountHolder);
        IAccount savings = new SavingsAccount(accountHolder);

        cc.deposit(100);
        cc.transfer(100, savings);

        cc.printBankStatement();
        savings.printBankStatement();
    }
}
