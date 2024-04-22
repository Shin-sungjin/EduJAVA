package Exception0117;

import java.io.IOException;

public class Account {
	
	//요구사항
	private long balance;
	
	
	//계좌 잔액을 확인하는 기능 getBalance();
	// deposit (입금 기능)
	// 빈 메서드 withdraw;
	//Account  Main 클래스 생성
	// 앞서 요구사항에 쓴 모든 동장 실행
	
	public Account(){
		balance = 0;
		System.out.println("새로운 계좌를 개설하였습니다.");
	}
	
//	public void getBalance() {
//		System.out.println("계좌 잔액: " +this.balance);
//	}
//	
	public long getBalnce() {
		return this.balance;
	}  //현업 코드 현업에서는 웬만하면 리턴값을 주도록 설계 ㅣ;sysout 만 써두는 것 자제 
	
	public void deposit(int money) {
		this.balance += money;
		System.out.println("입금 금액 : "+ money);
	}
	
	
	//커스텀 예외 메소드 
	//출금 기능 구현 메소드
	public void withdraw(int money) throws GunchimException{
		if(this.balance < money){
			throw new GunchimException("잔액이 부족하요");
		}
		this.balance -= money;
		
		
	}






























}
