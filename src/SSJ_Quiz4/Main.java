package SSJ_Quiz4;

public class Main {
	public static void main(String[] args) {
        Bank bank = new Bank();

        Account savingsAccount = new SavingsAccount("S001", 1000.0);
        Account creditAccount = new CreditAccount("C001", 500.0);

        bank.createAccount(savingsAccount);
        bank.createAccount(creditAccount);

        bank.displayAccountInfo("S001");
        bank.displayAccountInfo("C001");

        bank.deposit("S001", 500.0);
        bank.withdraw("C001", 200.0);

        bank.displayAccountInfo("S001");
        bank.displayAccountInfo("C001");
	}
}
