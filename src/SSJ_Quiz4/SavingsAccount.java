package SSJ_Quiz4;

public class SavingsAccount extends Account {
	private String name;
	private double money;
	
	SavingsAccount(String n, double money){
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
			System.out.println("±×·± °èÁÂ ¾ø½¤¿ä");
		}
	}
	
	@Override
	void withdraw(String n, double money) throws Exception{
		try {		
			if(this.name.equals(n)) {
				if(money-this.money <0) {
					throw new Exception("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");
				}
				this.money -= money;
		}
		else {
			System.out.println("±×·± °èÁÂ ¾ø½¤¿ä");
		}
		
		} catch (Exception e) {
			e.getMessage();
		}	
	}
	
	@Override
	void calculateInterest() {
		this.money += (this.money * 0.06);// TODO Auto-generated method stub
	
	}




}
