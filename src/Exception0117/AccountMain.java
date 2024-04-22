package Exception0117;

public class AccountMain {
	public static void main(String[] args) {
		Account ac = new Account();
		System.out.println("잔액 :" +ac.getBalnce());
		ac.deposit(10000);
		System.out.println("잔액 :" +ac.getBalnce());
		try {
			ac.withdraw(100000000);
		} catch (GunchimException e) {
			e.printStackTrace();
		}
	
	
	}
}

//계좌 관련 클래스
// 입금과 잔액 확인기능
// 확장 시 
// 출금, 송금, 이자율, 본인인증기능,

//2번쨰 질문
// 그렇다면 출금 기능을 만든다고 가정
// 출금 기능을 만들 때 문제점
// 잔액 보다 크면 안됌
