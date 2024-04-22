package Specialwork_1;

import java.text.Format;

public class Animal_main {
	public static void main(String[] args) {
		//라이온 클래스를 호출합니다. 
		
		Lion li = new Lion();
		li.breastfeed();
		li.sound();
		li.move();
		li.getEnergy();
		
		
		System.out.println("");
		//penguin 클래스 호출 
		Penguin pe = new Penguin();
		pe.fly();
		pe.sound();
		pe.move();
		pe.getEnergy();
		
	
	}


}

