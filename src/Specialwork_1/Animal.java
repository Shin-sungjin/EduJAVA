package Specialwork_1;

public interface Animal {
//	동물원에는 다양한 종류의 동물들이 있습니다. 각 동물들은 자신만의 특성을 가지고 있고, 
	//행동을 할 때마다 에너지를 소모합니다.
//
//	예를 들어, 사자는 '어흥'하고 울면 10의 에너지를 소모하고, 달릴 때는 20의 에너지를 소모합니다.
	//반면에 펭귄은 '꾸엑'하고 울면 5의 에너지를 소모하고, 걸을 때는 10의 에너지를 소모합니다.
//
//	이러한 동물들의 행동과 에너지 소모를 표현하기 위해 "Animal" 인터페이스를 정의하고, 
	//이를 확장하는 "Mammal"과 "Bird" 인터페이스를 만들려고 합니다.
	
//	"Mammal" 인터페이스와 "Bird" 인터페이스는 "Animal" 인터페이스를 확장하며,
	// 추가적으로 각각 "breastfeed()"와 "fly()" 메소드를 가집니다. 0
//
//	이 메소드들은 포유류가 젖을 먹이는 행동과 새가 날아다니는 행동을 나타냅니다.
//
//	"Lion" 클래스는 "Mammal" 인터페이스를, "Penguin" 클래스는 "Bird" 인터페이스를 구현하도록 해주세요. 
//
//	각 클래스는 인터페이스의 메소드를 오버라이딩하여, 사자와 펭귄의 행동을 출력하고, 에너지를 소모해야 합니다.
	
	    void sound(); // 동물이 울음소리를 내는 메소드
	    void move(); // 동물이 움직이는 메소드
	    int getEnergy(); // 동물의 현재 에너지를 반환하는 메소드


}

