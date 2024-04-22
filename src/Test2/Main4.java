package Test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface Account {    //Account 인터페이스 선언
    void deposit(double amount);  //double값을 받는 입금 메소드
    void withdraw(double amount);		// double 값을 받는 메서드
    void calculateInterest(); 
    void displayInfo();
    String getAccountNumber();
}

class SavingsAccount implements Account {    //Account  인터페이스를 구현하는 저축계좌
    private String accountNumber;		//통장 번호
    private double balance;			//잔액

    public SavingsAccount(String accountNumber, double balance) {   //생성자
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {    //double 값 입금,, 근데 내 생각엔 한화라면 int도 상관없겠지만, 외국 달러 등의 외환도 고려한다면, double이 더 적함
        balance += amount;			
        System.out.println("Deposit Successful!");
    }

    @Override
    public void withdraw(double amount) {   //출급
        if (amount > balance) {				// 잔액 부족
            throw new IllegalArgumentException("Insufficient Balance!");
        }
        balance -= amount;			//빼서 값에 제 대입
        System.out.println("Withdrawal Successful!");
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.05; // 5% interest rate   이율
        balance += interest;
        System.out.println("Interest Calculated and Added to Balance!");
    }

    @Override
    public void displayInfo() {		//해당 계좌 정보 공개 Method
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    @Override
    public String getAccountNumber() { 
        return accountNumber;
    }
}

class CreditAccount implements Account {  //신용 계좌
    private String accountNumber;
    private double balance;

    public CreditAccount(String accountNumber, double balance) {//생성자
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {  //입금 메소드
        balance += amount;
        System.out.println("Deposit Successful!");
    }

    @Override
    public void withdraw(double amount) { //출금 메소드
        if (amount > balance) {		//잔액 부족
            throw new IllegalArgumentException("Insufficient Balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal Successful!");
    }

    @Override
    public void calculateInterest() {   //이자 없음 ㅋ
        // No interest calculation for credit account
    }

    @Override
    public void displayInfo() {  //계좌 정보 구현 
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    @Override
    public String getAccountNumber() {   //계좌 번호 
        return accountNumber;
    }
}

class Bank {   //Bank 클래스
    private List<Account> accounts;   //List 생성(Account 타입의)

    public Bank() {			//List 생성자에 대한 선언
        accounts = new ArrayList<>();   //여기서 Account로 제네릭 타입을 설정해 줘야 되는 거 아닌가?
    }

    public void createAccount(Account account) {			///Account 의 인스턴스를 파라미터로 받는 메서드
        accounts.add(account);				//은행에 계좌 등록
        System.out.println("Account Created Successfully!");
    }

    public void displayAccountInfo(String accountNumber) {  //Account 의 인스턴스를 파라미터로 받는 메서드
        Account account = findAccount(accountNumber);			//  계과 정보 조화;
        if (account != null) {    //null값이 아닐 때
            account.displayInfo();		//계좌 정보 공개
        } else {
            throw new IllegalArgumentException("Account Not Found!");
        }//null 값일시 에러 발생 
    }

    public void deposit(String accountNumber, double amount) {  
        Account account = findAccount(accountNumber);   //계좌 정보 조회
        if (account != null) {
            account.deposit(amount);  //예금
        } else {			//정보 x 시 실패 
            throw new IllegalArgumentException("Account Not Found!");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = findAccount(accountNumber); //계좌 정보 조회
        if (account != null) {
            account.withdraw(amount);  //출금
        } else {
            throw new IllegalArgumentException("Account Not Found!"); //정보 x 시 실패 
        }
    }

    private Account findAccount(String accountNumber) {   //계좌 정보 조화
        for (Account account : accounts) {  //향상된 for문
            if (account.getAccountNumber().equals(accountNumber)) { //acounts 리스트내 해당 계좌 번호가 있는지 조회
                return account;   //있을 시 해당 계좌 리턴
            }
        }
        return null;  //없을 시 null값 리턴
    }
}

public class Main4 {
    public static void main(String[] args) {
        Bank bank = new Bank();  //Bank 생성

        Account savingsAccount = new SavingsAccount("S001", 1000.0);  //저축 계좌 생성, 잔액
        Account creditAccount = new CreditAccount("C001", 500.0);	//신용 계좌 생성, 잔액

        bank.createAccount(savingsAccount);		//bank 내에 등록
        bank.createAccount(creditAccount);		//bank 클래스에 등록

        bank.displayAccountInfo("S001");		// 계좌 정보 조화
        bank.displayAccountInfo("C001");

        bank.deposit("S001", 500.0);			//입금
        bank.withdraw("C001", 200.0);		//출금

     // 계좌 정보 조화
        bank.displayAccountInfo("S001");		
        bank.displayAccountInfo("C001");
    }
}


/* MYCode Review\
 * 
 * 
 * public abstract class Account {   //인스턴스 생성
	 abstract void deposit(String n, double money);  //해당 계과 정보가 존재한다면, money 입금
	 abstract void withdraw(String n , double money)throws Exception; // 잔액 부족을 위한 에러 컨트롤
	 abstract void calculateInterest();
	 abstract public String getName();  //계좌번호를 가져오기 위한 메서드
	 abstract public double getMoney();	//잔액을 가져오기 위한 메서드
	 
* public class SavingsAccount extends Account {
	private String name;	//계좌번호 
	private double money;   //잔액
	
	//생성자
	SavingsAccount(String n, double money){
		this.name = n;
		this.money =money;
	}
	
	//계좌번호 메소드
	@Override
	public String getName() {
		return this.name;
	}
	
	//계좌 잔액 메서드
	@Override
	public double getMoney() {
		return this.money;
	}
	

	@Override
	void deposit(String n, double money) {  //입금 메서드
		if(this.name.equals(n)) {  // 입금할려는 계좌 정보가, 동일한지 확인
			this.money += money;		//동이하다면 입금
		}
		else {
			System.out.println("그런 계좌 없숴요");	//동일하지 않을 시 예외 처리를 했어야 하나, If문으로 처리 
		}
	}
	
	@Override
	void withdraw(String n, double money) throws Exception{
		try {			
			if(this.name.equals(n)) {  //계과 정보 확인
				if(money-this.money <0) {  //잔액 부족 확인
					throw new Exception("잔액이 부족합니다.");
				}	 
				this.money -= money;  //else로 한번더 감쌋어야 하나, 문제 없었음, 아마 틀려도, money가 줄어드는 오류는 있었을 것 같다.
			}
		else {  //계좌 정보 일치 x 시 else로 오류 처리  
			System.out.println("그런 계좌 없숴요");  //throw 했어야 함
		}
		
		} catch (Exception e) {
				e.getMessage();
			}	
		}
	
	@Override
	void calculateInterest() {  //예금
			this.money += (this.money * 0.06);// TODO Auto-generated method stub
		}
	}
}


//신용계좌
* public class CreditAccount extends Account{
	private String name;
	private double money;
	
	//생성자
	public CreditAccount(String n, double money) {
			this.name = n;
			this.money =money;
		}
	//계좌번호 가져오는 메서드
	@Override
	public String getName() {
		return this.name;
	}
	
	//잔액 불러오는 메서드 
	@Override
	public double getMoney() {
		return this.money;
	}
	
	//입금 메서드   ,,저축 걔좌랑 알고리즘 동일
	@Override
	void deposit(String n, double money) {
		if(this.name.equals(n)) {
			this.money += money;
		}
		else {
			System.out.println("그런 계좌 없숴요");
		}
	}
	@Override
	void withdraw(String n , double money) throws Exception{
		try {		
			if(this.name.equals(n)) {
				if(money-this.money <0) {
					throw new Exception("잔액이 부족합니다.");
				}
				
				this.money -= money;
		}
		else {
			System.out.println("그런 계좌 없숴요");
		}
		
		} catch (Exception e) {
			e.getMessage();
		}	
	}
	@Override
	void calculateInterest() {
		this.money += (this.money * 0.06);	
	}
}

* public class Bank{   //Bank 클래서
	Map<String, Double> bank;
	//계좌 번호와 잔액을 매칭 하기 위해 Map 사용
	
	Bank(){  //생성자
	this.bank = new HashMap<String,Double>(); 
	}
	
//	createAccount() 계좌 생성
	public void createAccount(Account Ac) {  Ac의 계좌 번호와, 잔액을 Bank map 에 삽입, 
		this.bank.put(Ac.getName(), Ac.getMoney());
		}
		

//	displayAccountInfo() 계좌 조회
	public void displayAccountInfo(String name) { 
		try {
			boolean ck=this.bank.containsKey(name);  //Flag?? 이렇게 사용하는게 맞나
						//bank의 키 값에 해당 계좌 번호가 있다면, true;
			if (ck) { true 일시 잔액 공개 
				System.out.println("계좌 잔액 : "+this.bank.get(name));
			}
			else if(!ck) {아닐 시 에러 처리
				throw new Exception("존재하지 않는 계좌입니다.");
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
//	deposit  //계좌 조회에 동일 알고리즘 
	public void deposit(String name, double money) {
		boolean ck =this.bank.containsKey(name);
		if(ck) {
			double depo = this.bank.get(name) + money;
			bank.put(name, depo);
			System.out.println(money+"원 이 입금되었습니다.");
		}
		else if(!ck){
			System.out.println("존재하지 않는 계좌 입니다.");
		}
	}
//	whitdraw  //아오,, 오타 났었다,,, 입금과 동일한 알고리즘 
	public void withdraw(String name, double money) {
		try {		
			boolean ck =this.bank.containsKey(name);
			if( this.bank.get(name)<money ) {  //잔액이 부족한 경우 에러 추가 
				throw new Exception("잔액이 부족합니다");
			}
			else if(ck) {
				double depo = this.bank.get(name) - money;
				bank.put(name, depo);
				System.out.println(money+"원 이 입금되었습니다.");
			}	
		} catch (Exception e) {
			e.getMessage();
		}

	}

}

*/
