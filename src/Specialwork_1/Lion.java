package Specialwork_1;

import basic0118.Enrty;

public class Lion implements Mammal{

	
	//예를 들어, 사자는 '어흥'하고 울면 10의 에너지를 소모하고, 달릴 때는 20의 에너지를 소모합니다.
	//행동을 할 때마다 에너지를 소모합니다.
//	사자와 펭귄의 행동을 출력하고, 에너지를 소모해야 합니다.
	
	//에너지 정의가 필요,,
	private int energy =150;
	
	Lion(){
		
		this.energy = energy;
	}
	
	//어흥, 10 에너지 소모
	@Override
	public void sound() {
		if(this.energy <10) {
			System.out.println("사자의 에너지가 부족하여, 울지 못합니다.");
		}
		else{// TODO Auto-generated method stub
		System.out.println(" 어흥");
		this.energy -= 10;
		System.out.println("현재 에너지 잔량 : "+ this.energy);
		}
			
	}

	
	//달릴 때 20의 에너지 소모
	@Override
	public void move() {
		if(this.energy <20) {
			System.out.println("사자의 에너지가 부족하여, 달리지 못합니다.");
		}
		else {
		System.out.println("사자가 달려갑니다.");
		this.energy -= 20;
		}
		
	}

//	동물의 현재 에너지를 반환하는 메소드
	@Override
	public int getEnergy() {
		System.out.printf("사자의 현제 에너지는  %d입니다.", this.energy);
		return this.energy;
		
	}

	//포유류의 젖을 먹이는 행동?? 사자가 젖도 먹이나,,?
	@Override
	public void breastfeed() {
		System.out.println("사자가 아기 사자에게 젖을 먹입니다.");
	}

}
