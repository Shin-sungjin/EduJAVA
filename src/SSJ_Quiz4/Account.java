package SSJ_Quiz4;
/*
 * 문제:
"은행 계좌를 관리하는 프로그램을 구현해야 합니다. 은행 계좌에는 예금 계좌와 신용 계좌가 있으며, 
각 계좌는 입출금 및 이자 지급 기능을 가지고 있습니다. 다양한 계좌를 생성하고, 
계좌 정보를 조회하고 입출금을 수행하는 프로그램을 작성하세요."

요구사항:

Account 클래스를 작성하세요. 이 클래스는 deposit(), withdraw(), calculateInterest()라는 
메서드를 가져야 합니다.
다만 Account 클래스를 상속받을시 재정의가 필요합니다.
Account 클래스를 상속받는 SavingsAccount, CreditAccount 클래스를 작성하세요.

 
각 클래스는 부모 클래스의 메서드를 오버라이딩하여 입출금 및 이자 지급 기능을 구현해야 합니다.


Bank 클래스를 작성하세요. 이 클래스는 계좌 목록을 저장하고 관리하는 기능을 가져야 합니다. 
계좌 생성, 계좌 조회, 입출금 기능을 구현하세요.
예외처리를 활용하여 계좌 조회 및 입출금 시 발생할 수 있는 예외 상황을 처리하세요. 

예를 들어, 존재하지 않는 계좌를 조회하거나 출금할 때 잔액 이상의 금액을 출금하려고 하면 
예외를 발생시킬 수 있습니다.

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
