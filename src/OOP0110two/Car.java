package OOP0110two;

public class Car {
	//quiz
	// �� Ŭ�������� 
	// speed ��� �Ӽ���
	
	// �ش� �Ӽ��� �����ϴ� �����ڿ� �⺻ �����ڰ� �ʿ�
	// ������ �޼��� ����
	// 1.speedUp - speed ��� ������ ���� 10 ����
	// 2.speedDown - speed ��� ������ ���� 10 �϶�, 
	//				- 10 ������ ��� 0���� �ʱ�ȭ 
	// 3. stop - �ӵ��� 0���� �ʱ�ȭ 
	
	// sports car Ŭ������
	// �����ڸ� �����ϰ�, 
	// ������ ���� ����  (Car Ŭ���� ��� ���� ��)
	// 1. speedUP - �Ӽ��� 20 ����
	// 2. stop - ������ �Ͽ� ������ �޼��� ���
	//   -������ī�� ���� �ҿ��� ������ �ʾ� boy
	
	int speed;
	
	Car(){
		this.speed = 0;
	}
	Car(int speed){
		this.speed = speed;
	}
	
	public  void speedUp() {
		this.speed +=10;
	}
	
	public void speedDown() {
		this.speed = this.speed-10;
		if(this.speed < 0) {
			this.speed = 0;
			System.out.println("�ʱ�ȭ");
		}
		
	}
	
	public void stop() {
		this.speed = 0;
	}
	
}
