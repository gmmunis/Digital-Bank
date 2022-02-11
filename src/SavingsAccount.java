public class SavingsAccount extends Account {

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printBankStatement() {
        System.out.println("=== Savings Account Bank Statement ===");
        super.printCommonInformation();
    }
}
