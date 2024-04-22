package Specialwork;

public class Knight extends Hero {
//	기사는 검을 사용할 수 있으며, 검의 강인함을 나타내는 체력(health)을 가지고 있습니다.//	
//기사는 검을 휘둘러 공격할 수 있습니다. 공격을 하면 체력이 감소하고, (knigth의 체력이 감소하는 건가?)
//"검으로 공격했습니다!"라는 메시지가 출력됩니다.
//	기사는 검을 사용하는데, 검을 휘둘러 공격하는 것 외에도 "방패 막기"라는 특수한 방어 기술을 사용할 수 있습니다.
//"방패 막기"를 사용하면 적의 공격을 블록하여 받는 대미지를 감소시킬 수 있습니다.
//(데미지 감소는 해당 데미지의 값을 받아, 퍼센트로 체력에 영향을 주면 될 것 같음)
	
	//멤버 변수 선언
	private int health;
	
	//생성자
	public Knight(int health) {
		this.health = health;
	}
	
	//공격 메소드 
	public void attack() {
		deal(10); //그렇다면 피해를 입히고가 맞는 거 같은데 
		System.out.println("검으로 공격했습니다!");
	}
	
	//block 메소드 
	public void block() {
		this.health -= damage *0.8;
		System.out.println("방어하여 데미지를 감소했습니다. ");

	}
	
	public int getHealth() {
		return this.health;
	}
	
//	   Knight knight = new Knight(100);
//       knight.attack(); 공격 메소드
//       knight.block(); 방어 메소드 
//       System.out.println("기사의 체력: " + knight.getHealth()); 체력 구현 메소드 
}
