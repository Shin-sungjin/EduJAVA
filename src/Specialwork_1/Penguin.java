package Specialwork_1;

public class Penguin implements Bird {
	//반면에 펭귄은 '꾸엑'하고 울면 5의 에너지를 소모하고, 걸을 때는 10의 에너지를 소모합니다.
	
	int energy;
	
	Penguin(){
		this.energy =100;
	}
	
	
	//새가 난다. 에너지 소모값 산정X
	@Override
	public void fly() {
		System.out.println("펭귄이가 날아갑니다.");
		System.out.println("잠깐,, 펭귄이,,,,");
		System.out.println("날아,,,?");
		
	}

	//꾸엑 하고 울고, 5의 에너지 소모
	@Override
	public void sound() {
		if(this.energy <5) {
			System.out.println("현재 우리 펭귄은 울 힘이 없써용");
		}
		else {
			System.out.println("꾸엑");
			this.energy -= 5;
		}
		// TODO Auto-generated method stub
	
	}
	
	//걸어다니고 10의 에너지 소
	@Override
	public void move() {
		if(this.energy <10) {
			System.out.println("현재 우리 펭귄은 걸어다닐 힘이 없써용");
		}
		else {
			System.out.println("펭귄이 걷기 시작합니다.");
			this.energy -= 10;
		}
		// TODO Auto-generated method stub
	
	}

	
	//펭귄의 현재 에너지양 반환
	@Override
	public int getEnergy() {
		// TODO Auto-generated method stub
		System.out.printf("펭귄의 현재 에너지양은 %d입니다", energy);
		return energy;
		
	}

}
