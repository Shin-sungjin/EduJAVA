package OOP0111;

public class Siba implements Dog{

	// �������̽��� �����ڸ� ���� �� �����ϴ� ���� �Ұ���
	// �������̽��� �����ϴ� Ŭ�������� super Method �ᵵ 
	// ū �ǹ� X
//	public Siba(String color) {
//		super();
//	}
	
	// �Ʒ� Method ���� �̹� �������̽����� ����Ǿ� �ִ� Method
	// ������ �ش� �������̽��� ������ ��� ������ �� �������̽��� �ִ� 
	// Method���� Overriding �ؾ� �Ѵ�. ( abstract Ű���尡 �ִ�)
	
	
	@Override
	public void bite() {
		// TODO Auto-generated method stub
		System.out.println("���� ��");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�ͱ��ͱ�");
	}

	@Override
	public void ppuzik() {
		// TODO Auto-generated method stub
		
	}
	
}
