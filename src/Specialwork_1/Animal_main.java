package Specialwork_1;

import java.text.Format;

public class Animal_main {
	public static void main(String[] args) {
		//���̿� Ŭ������ ȣ���մϴ�. 
		
		Lion li = new Lion();
		li.breastfeed();
		li.sound();
		li.move();
		li.getEnergy();
		
		
		System.out.println("");
		//penguin Ŭ���� ȣ�� 
		Penguin pe = new Penguin();
		pe.fly();
		pe.sound();
		pe.move();
		pe.getEnergy();
		
	
	}


}

