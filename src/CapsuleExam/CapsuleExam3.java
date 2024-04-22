package CapsuleExam;

import Oop0109.capsuleExam;

public class CapsuleExam3 {
	public static void main(String[] args) {
		
		
		capsuleExam ce = new capsuleExam("test");
		ce.test2();
	
		// phone 클래스를 이용하여 인스턴스를 만들고
		// 해당 인스턴스의 속성값을 불러오시오
		
		
		Phone iPhone11ProMax = new Phone("예쁨", "미드나잇 그린", "애플", 34.2, 3);
		System.out.println(iPhone11ProMax.getBrand());
		System.out.println(iPhone11ProMax.getColor());
		System.out.println(iPhone11ProMax.getDesign());
		System.out.println(iPhone11ProMax.getSize());
		System.out.println(iPhone11ProMax.getCameraCnt());
		
		iPhone11ProMax.setDesign("육각");
		iPhone11ProMax.setColor("핫핑크");
		iPhone11ProMax.setBrand("군침");
		iPhone11ProMax.setSize(97.24);
		iPhone11ProMax.setCameraCnt(9);
		
		System.out.println("iPone11ProMax가 바뀌었습니다.");
//		System.out.println(iPhone11ProMax.getBrand());
//		System.out.println(iPhone11ProMax.getColor());
//		System.out.println(iPhone11ProMax.getDesign());
//		System.out.println(iPhone11ProMax.getSize());
//		System.out.println(iPhone11ProMax.getCameraCnt());
		
		System.out.println(iPhone11ProMax.toString());
		
	}
}
