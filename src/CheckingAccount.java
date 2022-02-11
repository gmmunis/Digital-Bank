public class CheckingAccount extends Account {

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void printBankStatement() {
        System.out.println("=== Checking Account Bank Statement ===");
        super.printCommonInformation();

    }
}
