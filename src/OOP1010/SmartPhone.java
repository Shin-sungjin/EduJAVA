package OOP1010;

import CapsuleExam.Phone;

public class SmartPhone extends Phone{
	SmartPhone(String design, String color, String brand, double size, int cameraCnt){
		super(brand, brand, brand, size, cameraCnt);
	}
	
	public static void main(String[] args) {
		SmartPhone sm = new SmartPhone("군", "침", "싹", 0, 0);
		// 부모 클래스로 부터 물려 받은 메서드 
		// 메서드를 굳이 스마트폰 클래스에 쓸 필요 업성ㅁ 
		sm.call();
	}
	
	
}
