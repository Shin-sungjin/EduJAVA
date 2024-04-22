package Specialwork;

public class Hero {
	//상대방에게 데미지를 전달하는 메소드가 필요해 보인다. 
	protected int damage;
	private int health;
	
	Hero(){
		
	}

	//근데 생성자 정의가 필요할려나? 
	
	// 데미지를 전달하기 위한 메소드 
	// 그럼 이걸 다른 Method에게 전달해야 하는데 그걸 구현을 어떻게 해야 할까, 
	// hm,,,
	
	public int deal(int a) {
		damage = a;
		return damage;
	}
	
	public int atk() {
		health -= damage;
		return this.health;
	}

	// 검사 -> 마법사를 attack 하는 경우, 마법사의 체력에 attack 값이 전달되어야 함. 
	// 그렇다면 검사가 공격을 마법사에게 했다는 것을 알려줘야 하는데,
	// 객체를 어떻게 지정해야 할까,,, 나중에 구현하자  
}
