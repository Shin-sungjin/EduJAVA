package Exception0117;


//사용자 정의 예외	
// 자바에서 기본으로 제공하는 예외가 있긴하나
// 제공하지 않는 예외는 아래와 같은 예시로 직접 작성해야 한다. 

// 응용 어플리케이션에서 발생할 수 있는 예외 케이스 
// 회원 가입에 실패하는 경우 


//사용자 정의 예외 클래스 선언 방법
// 1. Exception 클래스의 상속이 필요
// 2. 일반 예외와 runtime을 구분하는 것이 더 좋긴 함
// 3. 기본 생성자의 선언 [관슴]
// 4. 

public class GunchimException extends Exception {
			//조건 : 예외 최상위 클래스를 상속 받아야 함. 
	
	public GunchimException() {
		
	}
	
	public GunchimException(String msg) {
		super(msg);  //부모클래스인 생성자 호출
					 //예외 클래스인 경우 Exception과 연결이 필수
	}
	
}
