package SSJ_Quiz4;

import java.util.HashMap;
import java.util.Map;

public class Bank{
	Map<String, Double> bank;
	
	Bank(){
	this.bank = new HashMap<String,Double>();
	}
	
//	createAccount() ���� ����
	public void createAccount(Account Ac) {
		this.bank.put(Ac.getName(), Ac.getMoney());
		}

//	displayAccountInfo() ���� ��ȸ
	public void displayAccountInfo(String name) {
		try {
			boolean ck=this.bank.containsKey(name);
			if (ck) {
				System.out.println("���� �ܾ� : "+this.bank.get(name));
			}
			else if(!ck) {
				throw new Exception("�������� �ʴ� �����Դϴ�.");
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
			System.out.println(money+"�� �� �ԱݵǾ����ϴ�.");
		}
		else if(!ck){
			System.out.println("�������� �ʴ� ���� �Դϴ�.");
		}
	}
//	whitdraw
	public void withdraw(String name, double money) {
		try {		
			boolean ck =this.bank.containsKey(name);
			if( this.bank.get(name)<money ) {
				throw new Exception("�ܾ��� �����մϴ�");
			}
			else if(ck) {
				double depo = this.bank.get(name) - money;
				bank.put(name, depo);
				System.out.println(money+"�� �� �ԱݵǾ����ϴ�.");
			}	
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
