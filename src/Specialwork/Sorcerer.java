package Specialwork;

import java.util.ArrayList;
import java.util.List;

public class Sorcerer extends Hero{
//	마법사는 마법을 사용하여 마력을 소비할 수 있습니다. 마법을 사용하면 마력이 감소하고, "마법을 사용했습니다!"라는 메시지가 출력됩니다.
//	마법사는 마법을 사용할 수 있는데, 특정한 마법을 배우면 추가로 특수한 마법 기술을 사용할 수 있습니다. 
//	마법사는 "파이어볼"과 "힐링"이라는 두 가지 마법을 배울 수 있습니다. 
//	"파이어볼"을 사용하면 적을 공격하여 대미지를 입히고, "힐링"을 사용하면 자신의 체력을 회복할 수 있습니다.
// 	힐링 사용시 회복할 체력이 필요
//	마법사는 마법을 사용할 수 있으며, 주문의 힘을 나타내는 마력(mana)을 가지고 있습니다.
	private int health;
	private int mana;
	List<String> list = new ArrayList();
	
	Sorcerer(int a){
		this.mana = a;
		this.health =a;
	}
	
	
	//마법을 학습한다. 
	public void learnSpell(String a) {
		list.add(a);
		System.out.printf("%s를 학습합니다." , a);
		System.out.println();
		
	}
	
	//마법 casting
	public void castSpell(String m) {
		boolean spell =  list.contains(m);
		if(spell) {
			if(this.mana>10) {
				System.out.printf("%s을 사용합니다!", m);
				System.out.println();
				this.mana -= 10;
				if(m.equals("힐링")) {
					this.health += 10;
				}
				else if(m.equals("파이어볼")) {
					deal(20);
				}
			}
			else {
				System.out.println("마법을 사용할 마나가 부족합니다.");
			}
			
		}
		else {
			System.out.println("그런 마법은 배우지 않았어요");
		}
	}
	
	public int getMana() {
		return this.mana;
	}
	
	
	
	
	//Main Sorcerer 
//    Sorcerer sorcerer = new Sorcerer(50);
//    sorcerer.learnSpell("파이어볼");
//    sorcerer.castSpell("파이어볼");
//    System.out.println("마법사의 마력: " + sorcerer.getMana());
}
