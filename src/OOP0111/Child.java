package OOP0111;

public class Child extends Parents{
	int a = 9724;
	
	public Child() {
		super(97);
		System.out.println("������ ȣ��!");
		
	}
	
	@Override
	public void gunchim() {

		System.out.println("1��" + a);
		System.out.println("2��" + this.a);
		System.out.println("3��" + super.a); // �θ�Ŭ���� �ν��Ͻ� ������ ����
		super.gunchim(); // �θ� Ŭ������ Method�� �ڽ�Ŭ�������� ȣ��
		
	}
	
}


