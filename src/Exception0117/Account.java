package Exception0117;

import java.io.IOException;

public class Account {
	
	//�䱸����
	private long balance;
	
	
	//���� �ܾ��� Ȯ���ϴ� ��� getBalance();
	// deposit (�Ա� ���)
	// �� �޼��� withdraw;
	//Account  Main Ŭ���� ����
	// �ռ� �䱸���׿� �� ��� ���� ����
	
	public Account(){
		balance = 0;
		System.out.println("���ο� ���¸� �����Ͽ����ϴ�.");
	}
	
//	public void getBalance() {
//		System.out.println("���� �ܾ�: " +this.balance);
//	}
//	
	public long getBalnce() {
		return this.balance;
	}  //���� �ڵ� ���������� �����ϸ� ���ϰ��� �ֵ��� ���� ��;sysout �� ��δ� �� ���� 
	
	public void deposit(int money) {
		this.balance += money;
		System.out.println("�Ա� �ݾ� : "+ money);
	}
	
	
	//Ŀ���� ���� �޼ҵ� 
	//��� ��� ���� �޼ҵ�
	public void withdraw(int money) throws GunchimException{
		if(this.balance < money){
			throw new GunchimException("�ܾ��� �����Ͽ�");
		}
		this.balance -= money;
		
		
	}






























}
