package basic;

import java.util.Scanner;

public class jaPanGi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���(����� ����) Ȯ��
		final String[] berverName = {"��ī�ݶ�����", "���̴�", "�Ŀ����̵�", "���"}; 
		// ����� �ݾ� (��� = final) 
		final int[] beverCost = {800, 1500, 2000, 1500};
		// ��� ����
		int[] beverStock = {5, 2, 0, 3} ;
		// �ݾ� ���� 
		int money = 0 ;
		// �׸� ���� ���� 
		int choice = -1;
		
		Scanner sc = new Scanner(System.in);
		
		//�ݾ�����
		money = 4000;
		// ���� ����
		System.out.println("���Ḧ �������ֽʼ�");
		System.out.println("1.��ī���� 2.���̴� 3.�Ŀ����̵� 4.���");
		choice = sc.nextInt();
		System.out.println(berverName[choice - 1]);
		//��� �ִ� ���
		if(beverStock[choice-1] > 0) {
			System.out.println("�������");
			if (money >= beverCost[choice -1]) {
				money = money - beverCost[choice - 1];
			    beverStock[choice-1] = beverStock[choice-1] -1;
			}
			else if(money < beverCost[choice -1]) {
				System.out.println("�ݾ��� �����մϴ�.");
			}
		}
		// -> ���� ������ ���
		// -> ���� �ִ� ��� 
		// 		�ݾ� ���� 
		// 		��� ����
		// 		���� ���� �ȳ� 
		//		���� �ݾ� 
		//  	�Ž����� �޴� ��� 
		//		�Ÿ��������� ��ȯ���� �ʴ� ��� 
		
		//��� ���� ��� -> ���ᰡ ���� ��� ����Ʈ 
			else if (beverStock[choice - 1] <= 0) {
				System.out.println("��� ����");
			}
		
		
	}

}


//1�� ���� 12�� �� �ϳ� �Է�
// ���� ��� X


