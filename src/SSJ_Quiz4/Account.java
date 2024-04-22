package SSJ_Quiz4;
/*
 * ����:
"���� ���¸� �����ϴ� ���α׷��� �����ؾ� �մϴ�. ���� ���¿��� ���� ���¿� �ſ� ���°� ������, 
�� ���´� ����� �� ���� ���� ����� ������ �ֽ��ϴ�. �پ��� ���¸� �����ϰ�, 
���� ������ ��ȸ�ϰ� ������� �����ϴ� ���α׷��� �ۼ��ϼ���."

�䱸����:

Account Ŭ������ �ۼ��ϼ���. �� Ŭ������ deposit(), withdraw(), calculateInterest()��� 
�޼��带 ������ �մϴ�.
�ٸ� Account Ŭ������ ��ӹ����� �����ǰ� �ʿ��մϴ�.
Account Ŭ������ ��ӹ޴� SavingsAccount, CreditAccount Ŭ������ �ۼ��ϼ���.

 
�� Ŭ������ �θ� Ŭ������ �޼��带 �������̵��Ͽ� ����� �� ���� ���� ����� �����ؾ� �մϴ�.


Bank Ŭ������ �ۼ��ϼ���. �� Ŭ������ ���� ����� �����ϰ� �����ϴ� ����� ������ �մϴ�. 
���� ����, ���� ��ȸ, ����� ����� �����ϼ���.
����ó���� Ȱ���Ͽ� ���� ��ȸ �� ����� �� �߻��� �� �ִ� ���� ��Ȳ�� ó���ϼ���. 

���� ���, �������� �ʴ� ���¸� ��ȸ�ϰų� ����� �� �ܾ� �̻��� �ݾ��� ����Ϸ��� �ϸ� 
���ܸ� �߻���ų �� �ֽ��ϴ�.

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
 */
public abstract class Account {
	 abstract void deposit(String n, double money);
	 abstract void withdraw(String n , double money)throws Exception;
	 abstract void calculateInterest();
	 abstract public String getName();
	 abstract public double getMoney();
}
