package OOP0111;

import java.util.concurrent.AbstractExecutorService;

// 추상 클래스의 필요성
// 객체지향 활용 시 어느 곳에나 사용할 것 같은 (사용빈도가 높은)
// (공통부분) 들을 추상 클래스로 정의하여 누구나 같은 Method name을 활용

 class ABS extends AbstractExam{
	
	public static void main(String[] args) {
		
	}
	
	@Override
	public void gunchim2(){
		
	}
}

public abstract  class AbstractExam {
	
	//추상 메서드
	public abstract void gunchim2();
	
	public static void main(String[] args) {
		// 추상 클래스 
		// 상상 속 설계도? -미완성 설계도 
		// 1. 인스턴스를 만들 수 없음
		// 2, 일반 메서드가 추상 메서드를 호출 할 수 있다. 
		// 3. 다른 클래스 안내도 
		//   - 추상 클래스에서 기능이 없는 메서드들을 대거 생성 후 
		//   - 추상 클래스를 상속받아 다른 클래스가 해당 메서드를 완성해서 사용
		
		
		// 추상화
		// 내용보다는 핵심적인 개념을 추려내는 개념
		// 혹은 추상화 과정에서 공통적인 것들을 추려내는 것도 포함
		
		
		// 추상화의 핵심
		// 1. 필요한 것만
		// 2. 그리고 필요한 것을 추출하여 노출 시키는 것
		// 3. 어떻게 보다는 무엇에 집중할 것
	
		
		// 추상화와 관련된 용어
		//  1.  추상 클래스
		//  2.  추상 메서드
		
		// 추상 클래스의 특징
		// 1. 생성자의 정의
		// 2. 단독 인스턴스 생성 불가  (가능해도, 의미 없어서 하지 마셈)
		// 3. 추상 클래스에서는 private를 사용할 수 없다. 
		//		-> 의미가 없다. 
		// 4. 상속받는 클래느느 반드시 추상 클래스의 추상메서드를 
		//   오버라이딩 해야 한다. (구현체가 존재 해야 한다 == 오버라이딩 된 메소드가 필요하다)
		
		// 
	}
}
