package Oop0109;

class PDog{ //부모 클래스
	String color = "hotPink";
	int age = 5;
	
	void howl() {
		System.out.println("으르렁");
	}
}

class CDog extends PDog{ //자식 클래스
	
}



public class ExtandsExam {
	

	
	// 상속 : 물려 받는 것
	// -> 객체 지향에서는 기존의 클래스를 재 사용하여 
	// 	  새로운 클래스를 작성하는 개념
	//  관계 없는 두 개 이상의 클래스를 부모 자식관계로 만들어준다. 
	//  자식 클래스는 부모 클래스의 모든 멤버 변수를 상속 받음(생성자)
	//  기존 클래스를 확장 하고 싶을 때 상속을 이용한다.
	// 
	
	// 포함 관계
	// 다중 상속을 대체 하는 방법;
	// 클래스의 멤버 변수로 다른 클래스를 선언 하는 것
	// 포함 관계 생성 시 주의사항
	//  규모가 작은 클래스를 큰 쪽에 인스턴스를 두는 식.[규모가 더 크면 Extends, 작은 클래스는 인스턴스로]
	
	
	// 자바와 상속
	// 자바는 기본적으로는 단일 상속만 허용. 
	
	// 다중 상속의 문제점
	// 1. 부모 클래스가 너무 많아져서 상속 계층 자체가 복잡함. 
	// 2. 클래스간 관계글 관리하는 것이 어려움
	// 3. 부모 클래스간 멤버 변수 충돌 우려
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CDog dog1 = new CDog();
		dog1.howl();
		
		
		
		
	}

}
