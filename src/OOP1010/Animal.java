package OOP1010;

public class Animal {
	public void eat(){
		
	}
	
	public void sleep() {	
	}
}

class camel extends Animal{
	@Override
	public void eat(){
		System.out.println("Ǯ ����");
	}
}

class tiger extends Animal{
	@Override
	public void eat(){
		System.out.println("��� ����");
	}
}

// �ִϸ��� ��� �޴� ���׿� bird Ŭ����
class Dog extends Animal{
	@Override //����� �ִ� �ּ�
	public void eat(){
		System.out.println("�� ����");
		
	}
	
	void howl() {
	  System.out.println("�п�");
  }
}


class Bird extends Animal{
	void howl() {
		System.out.println("±±");
	}
}

//�������̽� ���� ���� ����� �����ϴ� ���
class DogBird extends Dog{
	// Ŭ������ ���� 
	Bird b = new Bird();	//(DogBird�� �������) / ���԰���
	//���� ��Ȯ�� ����� �ƴϰ�, ���� ������ 
}
