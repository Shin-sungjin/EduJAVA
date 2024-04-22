package Test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface Account {    //Account �������̽� ����
    void deposit(double amount);  //double���� �޴� �Ա� �޼ҵ�
    void withdraw(double amount);		// double ���� �޴� �޼���
    void calculateInterest(); 
    void displayInfo();
    String getAccountNumber();
}

class SavingsAccount implements Account {    //Account  �������̽��� �����ϴ� �������
    private String accountNumber;		//���� ��ȣ
    private double balance;			//�ܾ�

    public SavingsAccount(String accountNumber, double balance) {   //������
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {    //double �� �Ա�,, �ٵ� �� ������ ��ȭ��� int�� �����������, �ܱ� �޷� ���� ��ȯ�� ����Ѵٸ�, double�� �� ����
        balance += amount;			
        System.out.println("Deposit Successful!");
    }

    @Override
    public void withdraw(double amount) {   //���
        if (amount > balance) {				// �ܾ� ����
            throw new IllegalArgumentException("Insufficient Balance!");
        }
        balance -= amount;			//���� ���� �� ����
        System.out.println("Withdrawal Successful!");
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.05; // 5% interest rate   ����
        balance += interest;
        System.out.println("Interest Calculated and Added to Balance!");
    }

    @Override
    public void displayInfo() {		//�ش� ���� ���� ���� Method
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    @Override
    public String getAccountNumber() { 
        return accountNumber;
    }
}

class CreditAccount implements Account {  //�ſ� ����
    private String accountNumber;
    private double balance;

    public CreditAccount(String accountNumber, double balance) {//������
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {  //�Ա� �޼ҵ�
        balance += amount;
        System.out.println("Deposit Successful!");
    }

    @Override
    public void withdraw(double amount) { //��� �޼ҵ�
        if (amount > balance) {		//�ܾ� ����
            throw new IllegalArgumentException("Insufficient Balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal Successful!");
    }

    @Override
    public void calculateInterest() {   //���� ���� ��
        // No interest calculation for credit account
    }

    @Override
    public void displayInfo() {  //���� ���� ���� 
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    @Override
    public String getAccountNumber() {   //���� ��ȣ 
        return accountNumber;
    }
}

class Bank {   //Bank Ŭ����
    private List<Account> accounts;   //List ����(Account Ÿ����)

    public Bank() {			//List �����ڿ� ���� ����
        accounts = new ArrayList<>();   //���⼭ Account�� ���׸� Ÿ���� ������ ��� �Ǵ� �� �ƴѰ�?
    }

    public void createAccount(Account account) {			///Account �� �ν��Ͻ��� �Ķ���ͷ� �޴� �޼���
        accounts.add(account);				//���࿡ ���� ���
        System.out.println("Account Created Successfully!");
    }

    public void displayAccountInfo(String accountNumber) {  //Account �� �ν��Ͻ��� �Ķ���ͷ� �޴� �޼���
        Account account = findAccount(accountNumber);			//  ��� ���� ��ȭ;
        if (account != null) {    //null���� �ƴ� ��
            account.displayInfo();		//���� ���� ����
        } else {
            throw new IllegalArgumentException("Account Not Found!");
        }//null ���Ͻ� ���� �߻� 
    }

    public void deposit(String accountNumber, double amount) {  
        Account account = findAccount(accountNumber);   //���� ���� ��ȸ
        if (account != null) {
            account.deposit(amount);  //����
        } else {			//���� x �� ���� 
            throw new IllegalArgumentException("Account Not Found!");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = findAccount(accountNumber); //���� ���� ��ȸ
        if (account != null) {
            account.withdraw(amount);  //���
        } else {
            throw new IllegalArgumentException("Account Not Found!"); //���� x �� ���� 
        }
    }

    private Account findAccount(String accountNumber) {   //���� ���� ��ȭ
        for (Account account : accounts) {  //���� for��
            if (account.getAccountNumber().equals(accountNumber)) { //acounts ����Ʈ�� �ش� ���� ��ȣ�� �ִ��� ��ȸ
                return account;   //���� �� �ش� ���� ����
            }
        }
        return null;  //���� �� null�� ����
    }
}

public class Main4 {
    public static void main(String[] args) {
        Bank bank = new Bank();  //Bank ����

        Account savingsAccount = new SavingsAccount("S001", 1000.0);  //���� ���� ����, �ܾ�
        Account creditAccount = new CreditAccount("C001", 500.0);	//�ſ� ���� ����, �ܾ�

        bank.createAccount(savingsAccount);		//bank ���� ���
        bank.createAccount(creditAccount);		//bank Ŭ������ ���

        bank.displayAccountInfo("S001");		// ���� ���� ��ȭ
        bank.displayAccountInfo("C001");

        bank.deposit("S001", 500.0);			//�Ա�
        bank.withdraw("C001", 200.0);		//���

     // ���� ���� ��ȭ
        bank.displayAccountInfo("S001");		
        bank.displayAccountInfo("C001");
    }
}


/* MYCode Review\
 * 
 * 
 * public abstract class Account {   //�ν��Ͻ� ����
	 abstract void deposit(String n, double money);  //�ش� ��� ������ �����Ѵٸ�, money �Ա�
	 abstract void withdraw(String n , double money)throws Exception; // �ܾ� ������ ���� ���� ��Ʈ��
	 abstract void calculateInterest();
	 abstract public String getName();  //���¹�ȣ�� �������� ���� �޼���
	 abstract public double getMoney();	//�ܾ��� �������� ���� �޼���
	 
* public class SavingsAccount extends Account {
	private String name;	//���¹�ȣ 
	private double money;   //�ܾ�
	
	//������
	SavingsAccount(String n, double money){
		this.name = n;
		this.money =money;
	}
	
	//���¹�ȣ �޼ҵ�
	@Override
	public String getName() {
		return this.name;
	}
	
	//���� �ܾ� �޼���
	@Override
	public double getMoney() {
		return this.money;
	}
	

	@Override
	void deposit(String n, double money) {  //�Ա� �޼���
		if(this.name.equals(n)) {  // �Ա��ҷ��� ���� ������, �������� Ȯ��
			this.money += money;		//�����ϴٸ� �Ա�
		}
		else {
			System.out.println("�׷� ���� ������");	//�������� ���� �� ���� ó���� �߾�� �ϳ�, If������ ó�� 
		}
	}
	
	@Override
	void withdraw(String n, double money) throws Exception{
		try {			
			if(this.name.equals(n)) {  //��� ���� Ȯ��
				if(money-this.money <0) {  //�ܾ� ���� Ȯ��
					throw new Exception("�ܾ��� �����մϴ�.");
				}	 
				this.money -= money;  //else�� �ѹ��� ������� �ϳ�, ���� ������, �Ƹ� Ʋ����, money�� �پ��� ������ �־��� �� ����.
			}
		else {  //���� ���� ��ġ x �� else�� ���� ó��  
			System.out.println("�׷� ���� ������");  //throw �߾�� ��
		}
		
		} catch (Exception e) {
				e.getMessage();
			}	
		}
	
	@Override
	void calculateInterest() {  //����
			this.money += (this.money * 0.06);// TODO Auto-generated method stub
		}
	}
}


//�ſ����
* public class CreditAccount extends Account{
	private String name;
	private double money;
	
	//������
	public CreditAccount(String n, double money) {
			this.name = n;
			this.money =money;
		}
	//���¹�ȣ �������� �޼���
	@Override
	public String getName() {
		return this.name;
	}
	
	//�ܾ� �ҷ����� �޼��� 
	@Override
	public double getMoney() {
		return this.money;
	}
	
	//�Ա� �޼���   ,,���� ���¶� �˰��� ����
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

* public class Bank{   //Bank Ŭ����
	Map<String, Double> bank;
	//���� ��ȣ�� �ܾ��� ��Ī �ϱ� ���� Map ���
	
	Bank(){  //������
	this.bank = new HashMap<String,Double>(); 
	}
	
//	createAccount() ���� ����
	public void createAccount(Account Ac) {  Ac�� ���� ��ȣ��, �ܾ��� Bank map �� ����, 
		this.bank.put(Ac.getName(), Ac.getMoney());
		}
		

//	displayAccountInfo() ���� ��ȸ
	public void displayAccountInfo(String name) { 
		try {
			boolean ck=this.bank.containsKey(name);  //Flag?? �̷��� ����ϴ°� �³�
						//bank�� Ű ���� �ش� ���� ��ȣ�� �ִٸ�, true;
			if (ck) { true �Ͻ� �ܾ� ���� 
				System.out.println("���� �ܾ� : "+this.bank.get(name));
			}
			else if(!ck) {�ƴ� �� ���� ó��
				throw new Exception("�������� �ʴ� �����Դϴ�.");
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
//	deposit  //���� ��ȸ�� ���� �˰��� 
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
//	whitdraw  //�ƿ�,, ��Ÿ ������,,, �Աݰ� ������ �˰��� 
	public void withdraw(String name, double money) {
		try {		
			boolean ck =this.bank.containsKey(name);
			if( this.bank.get(name)<money ) {  //�ܾ��� ������ ��� ���� �߰� 
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

*/
