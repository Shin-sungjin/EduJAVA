package SSJ_Quiz4;

public class CreditAccount extends Account{
	private String name;
	private double money;
	
	public CreditAccount(String n, double money) {
			this.name = n;
			this.money =money;
		}
	
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public double getMoney() {
		return this.money;
	}
	@Override
	void deposit(String n, double money) {
		if(this.name.equals(n)) {
			this.money += money;
		}
		else {
			System.out.println("�׷� ���� ������");
		}
	}
	@Override
	void withdraw(String n , double money) throws Exception{
		try {		
			if(this.name.equals(n)) {
				if(money-this.money <0) {
					throw new Exception("�ܾ��� �����մϴ�.");
				}
				
				this.money -= money;
		}
		else {
			System.out.println("�׷� ���� ������");
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
