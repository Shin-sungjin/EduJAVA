package OOP0111;

import java.awt.List;
import java.util.ArrayList;

public class CatPoly {
	
	protected String color;
	
	public void scertch() {
		System.out.println("������ ���� �ܱ�");
	}
	
	public void bite() {
		System.out.println("��");
	}
	
	public static void main(String[] args) {
		//������ ����̴�.
		CatPoly c1 = new Regdol();
		c1.bite();
		
		// �������� Ȱ���Ͽ� �ν��Ͻ��� ���� �� 
		// �޼��带 ȣ���� ��
		// �������̵� �� �޼ҵ�� ���������� �ڽ� Method ȣ��
		// ������ �ڽ� �޼��带 ���̷�Ʈ�� ȣ���ϴ� ���� �Ұ����ϴ�. 
		// c1.eat();
		//((Regdol) c1).eat();
		 
		// ���� �������̵� ���� ���� �ڽ� �޼��带 ȣ���ҷ���
		// Ÿ�� ��ȯ(ĳ����)�� ���� ���� �� ȣ�� �ؾ� ��.
		Regdol letdol =(Regdol) c1;
		
		letdol.eat();
		
		
		
		//�ڼ��� ����̴�. 
		CatPoly c2  = new KoreanShort();
		
		
		 
	}
}

class Regdol extends CatPoly{
	
	@Override
	public void bite() {
		System.out.println("������");
	}
	
	public void eat() {
		System.out.println("�� ���� ���� ����̰� �ƴ϶� ������");
	}
}

class KoreanShort extends CatPoly{	
	public void eat() {
		System.out.println(" �� �ôµ�....");
	}
	
}