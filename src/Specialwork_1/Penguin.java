package Specialwork_1;

public class Penguin implements Bird {
	//�ݸ鿡 ����� '�ٿ�'�ϰ� ��� 5�� �������� �Ҹ��ϰ�, ���� ���� 10�� �������� �Ҹ��մϴ�.
	
	int energy;
	
	Penguin(){
		this.energy =100;
	}
	
	
	//���� ����. ������ �Ҹ� ����X
	@Override
	public void fly() {
		System.out.println("����̰� ���ư��ϴ�.");
		System.out.println("���,, �����,,,,");
		System.out.println("����,,,?");
		
	}

	//�ٿ� �ϰ� ���, 5�� ������ �Ҹ�
	@Override
	public void sound() {
		if(this.energy <5) {
			System.out.println("���� �츮 ����� �� ���� �����");
		}
		else {
			System.out.println("�ٿ�");
			this.energy -= 5;
		}
		// TODO Auto-generated method stub
	
	}
	
	//�ɾ�ٴϰ� 10�� ������ ��
	@Override
	public void move() {
		if(this.energy <10) {
			System.out.println("���� �츮 ����� �ɾ�ٴ� ���� �����");
		}
		else {
			System.out.println("����� �ȱ� �����մϴ�.");
			this.energy -= 10;
		}
		// TODO Auto-generated method stub
	
	}

	
	//����� ���� �������� ��ȯ
	@Override
	public int getEnergy() {
		// TODO Auto-generated method stub
		System.out.printf("����� ���� ���������� %d�Դϴ�", energy);
		return energy;
		
	}

}
