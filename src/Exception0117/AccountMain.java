package Exception0117;

public class AccountMain {
	public static void main(String[] args) {
		Account ac = new Account();
		System.out.println("�ܾ� :" +ac.getBalnce());
		ac.deposit(10000);
		System.out.println("�ܾ� :" +ac.getBalnce());
		try {
			ac.withdraw(100000000);
		} catch (GunchimException e) {
			e.printStackTrace();
		}
	
	
	}
}

//���� ���� Ŭ����
// �Աݰ� �ܾ� Ȯ�α��
// Ȯ�� �� 
// ���, �۱�, ������, �����������,

//2���� ����
// �׷��ٸ� ��� ����� ����ٰ� ����
// ��� ����� ���� �� ������
// �ܾ� ���� ũ�� �ȉ�
