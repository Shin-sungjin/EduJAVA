package Specialwork;

public class Knight extends Hero {
//	���� ���� ����� �� ������, ���� �������� ��Ÿ���� ü��(health)�� ������ �ֽ��ϴ�.//	
//���� ���� �ֵѷ� ������ �� �ֽ��ϴ�. ������ �ϸ� ü���� �����ϰ�, (knigth�� ü���� �����ϴ� �ǰ�?)
//"������ �����߽��ϴ�!"��� �޽����� ��µ˴ϴ�.
//	���� ���� ����ϴµ�, ���� �ֵѷ� �����ϴ� �� �ܿ��� "���� ����"��� Ư���� ��� ����� ����� �� �ֽ��ϴ�.
//"���� ����"�� ����ϸ� ���� ������ ����Ͽ� �޴� ������� ���ҽ�ų �� �ֽ��ϴ�.
//(������ ���Ҵ� �ش� �������� ���� �޾�, �ۼ�Ʈ�� ü�¿� ������ �ָ� �� �� ����)
	
	//��� ���� ����
	private int health;
	
	//������
	public Knight(int health) {
		this.health = health;
	}
	
	//���� �޼ҵ� 
	public void attack() {
		deal(10); //�׷��ٸ� ���ظ� ������ �´� �� ������ 
		System.out.println("������ �����߽��ϴ�!");
	}
	
	//block �޼ҵ� 
	public void block() {
		this.health -= damage *0.8;
		System.out.println("����Ͽ� �������� �����߽��ϴ�. ");

	}
	
	public int getHealth() {
		return this.health;
	}
	
//	   Knight knight = new Knight(100);
//       knight.attack(); ���� �޼ҵ�
//       knight.block(); ��� �޼ҵ� 
//       System.out.println("����� ü��: " + knight.getHealth()); ü�� ���� �޼ҵ� 
}
