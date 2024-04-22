package extendOverriding;

public class SSD extends Hdd {
	
	//부모 클래스 HDD의 멤버 변수와 이름은 같지만
	// 두 멤버 변수는 전혀 다른 영역이다. (영역 주소가 다르기 때문)
	int size;
	int rpm;
	
	SSD(){
		
	}
	
	SSD(int size, int rpm){
		this.size = size;
		this.rpm = rpm;
	}
	
//	@Override  /
//	public void Gunchim() {
//		
//	}
//	위 메소드는 HDD클래스에서 존재하지 않음
	
	@Override
	public void serchStat() {
		//이 클래스는 HDD에는 존재하지만
		//SSD 클래스에서 재 정의할 것을 선언
		System.out.println(this.size);
		System.out.println(this.rpm);
	}

	
	
}
