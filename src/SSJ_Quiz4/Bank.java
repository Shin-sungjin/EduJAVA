package SSJ_Quiz4;

import java.util.HashMap;
import java.util.Map;

public class Bank{
	Map<String, Double> bank;
	
	Bank(){
	this.bank = new HashMap<String,Double>();
	}
	
//	createAccount() 계좌 생성
	public void createAccount(Account Ac) {
		this.bank.put(Ac.getName(), Ac.getMoney());
		}

//	displayAccountInfo() 계좌 조회
	public void displayAccountInfo(String name) {
		try {
			boolean ck=this.bank.containsKey(name);
			if (ck) {
				System.out.println("계좌 잔액 : "+this.bank.get(name));
			}
			else if(!ck) {
				throw new Exception("존재하지 않는 계좌입니다.");
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
//	deposit
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
//	whitdraw
	public void withdraw(String name, double money) {
		try {		
			boolean ck =this.bank.containsKey(name);
			if( this.bank.get(name)<money ) {
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
