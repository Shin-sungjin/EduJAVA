package Specialwork;

public class Hero {
	//���濡�� �������� �����ϴ� �޼ҵ尡 �ʿ��� ���δ�. 
	protected int damage;
	private int health;
	
	Hero(){
		
	}

	//�ٵ� ������ ���ǰ� �ʿ��ҷ���? 
	
	// �������� �����ϱ� ���� �޼ҵ� 
	// �׷� �̰� �ٸ� Method���� �����ؾ� �ϴµ� �װ� ������ ��� �ؾ� �ұ�, 
	// hm,,,
	
	public int deal(int a) {
		damage = a;
		return damage;
	}
	
	public int atk() {
		health -= damage;
		return this.health;
	}

	// �˻� -> �����縦 attack �ϴ� ���, �������� ü�¿� attack ���� ���޵Ǿ�� ��. 
	// �׷��ٸ� �˻簡 ������ �����翡�� �ߴٴ� ���� �˷���� �ϴµ�,
	// ��ü�� ��� �����ؾ� �ұ�,,, ���߿� ��������  
}
