package Specialwork_1;

import basic0118.Enrty;

public class Lion implements Mammal{

	
	//���� ���, ���ڴ� '����'�ϰ� ��� 10�� �������� �Ҹ��ϰ�, �޸� ���� 20�� �������� �Ҹ��մϴ�.
	//�ൿ�� �� ������ �������� �Ҹ��մϴ�.
//	���ڿ� ����� �ൿ�� ����ϰ�, �������� �Ҹ��ؾ� �մϴ�.
	
	//������ ���ǰ� �ʿ�,,
	private int energy =150;
	
	Lion(){
		
		this.energy = energy;
	}
	
	//����, 10 ������ �Ҹ�
	@Override
	public void sound() {
		if(this.energy <10) {
			System.out.println("������ �������� �����Ͽ�, ���� ���մϴ�.");
		}
		else{// TODO Auto-generated method stub
		System.out.println(" ����");
		this.energy -= 10;
		System.out.println("���� ������ �ܷ� : "+ this.energy);
		}
			
	}

	
	//�޸� �� 20�� ������ �Ҹ�
	@Override
	public void move() {
		if(this.energy <20) {
			System.out.println("������ �������� �����Ͽ�, �޸��� ���մϴ�.");
		}
		else {
		System.out.println("���ڰ� �޷����ϴ�.");
		this.energy -= 20;
		}
		
	}

//	������ ���� �������� ��ȯ�ϴ� �޼ҵ�
	@Override
	public int getEnergy() {
		System.out.printf("������ ���� ��������  %d�Դϴ�.", this.energy);
		return this.energy;
		
	}

	//�������� ���� ���̴� �ൿ?? ���ڰ� ���� ���̳�,,?
	@Override
	public void breastfeed() {
		System.out.println("���ڰ� �Ʊ� ���ڿ��� ���� ���Դϴ�.");
	}

}
