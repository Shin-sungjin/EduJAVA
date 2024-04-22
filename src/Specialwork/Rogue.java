package Specialwork;

import java.util.ArrayList;
import java.util.List;

public class Rogue extends Hero {
//	도적은 은신하여 숨을 수 있습니다. 은신을 하면 민첩성이 감소하고, "은신합니다..."라는 메시지가 출력됩니다.
//	도적은 은신 능력 외에도 "배낭 가방"이라는 특수한 기능을 갖고 있습니다. 
//	배낭 가방은 도적이 훔친 보물이나 아이템을 저장하는 용도로 사용됩니다. 
//	도적은 배낭에 아이템을 추가하거나 제거할 수 있습니다.
	
// (배낭은 배열로 표현하는 것이 편해보인다. 
// 배열에 계속 추가하는 것을 방지하기 위해서 배열 최댓값은 5정도로 주고, 
// 인덱스를 늘려줄 cnt 변수 선언이 필요해보인다 
// 추가시 마다. ++로,  => 이경우, 최댓값을 넘었을 경우 배열에 추가되지 않을 상황이 발생 할 수 있는데, 
// 차라리 추가/ 삭제 시, 몇번 째에 저장하고, 아이템을 삭제할 지 사용자가 지정하도록 하는 것도 방법일 수 있겠다. )
	
//	도적은 은신을 사용할 수 있으며, 은신의 숙련도를 나타내는 민첩성(agility)을 가지고 있습니다.
	private int agility;
	private int health;
	//배낭 가방 선언
	List<String> list = new ArrayList();
	
	//생성자 선언
	Rogue(int a){
		this.agility =a;
		this.health = a;
	}
	
	public void hide() {
		this.agility -=5;
		System.out.println("은신합니다.....");
	}
	
	public void outOfHide() {
		this.agility += 5;
		System.out.println("은신을 해제합니다. ");
	}
	
	public void addItemToBackpack(String s) {
		list.add(s);
		System.out.printf("%s를 배낭에 저장합니다", s);
		System.out.println();
	}
	
	public void removeItemFromBackpack(String s) {
		boolean tre = list.contains(s);
		if(tre) {
			list.remove(s);
			System.out.printf("%s를 배낭에 제거합니다", s);
			System.out.println();
		}
		else {
			System.out.println("그런 아이템은 없습니다.");
		}
	}
	
	
    // 도적 객체 생성
//    Rogue rogue = new Rogue(20);
//    rogue.hide();
//    rogue.addItemToBackpack("금화");
//    rogue.removeItemFromBackpack("보석");
}

