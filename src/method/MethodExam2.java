package method;

public class MethodExam2 {
	
	int gunchim = 10;
	static String lupy = "군침이 싹도노";  // 전역 변수; 
	// 자바는 static 이라는 정적 변수가 붙어야 전역변수라 할 수 있음. 
	// static = 미리 셋팅 하는 개념이라고 생각하면 될 것 같음 
	// 메모리 상 원래는 실행 될 때 올라오나, static은 이미 실행 전에 올라와있다고 볼 수 있음 
	// 전역 변수라고 해도 어느 클래스에 있는지는 알아야 함
	
	//Static 사용시 Method pakage 내 모든 파일에서 lupy 호출 가능 
	
	// 전역 변수 
	// 접근 제어자만 문제 없다면 
	// 클래스만 지칭 된다면 어디서든지 사용할 수 있는 변수 
	//  -> 인스턴스 라는 것을 생성하지 않아도 가능 
	// 전역 변수는 main Method 내부에서는 사용 불가. 
	
	// 전역 Method 
	// 메인을 제외한 static 키워드가 붙어있는 메서드 
	// 전역 변수와 마찬가지로 클래스만 지칭 된다면 언제 어디서나 사용가능
	// (접근 제어자만 문제 없다면)
	
	//main Method
	// java RunTime이 자동으로 호출하는 Method
	// -> Program 실행시 가장 먼저 수행되는 Method.
	// String[] args => 실질적 파라미터는 자바 커맨드를 입력하는 
	//					커맨드 라인에서 입력해주기 때문에 크게 상관 X
	
	public static void main(String[] args) {
						//  param type parma
		
		
		
		System.out.println(lupy);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
