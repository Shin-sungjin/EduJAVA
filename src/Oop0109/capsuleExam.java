package Oop0109;

public class capsuleExam {
	
	private String test1;
	
//	capsuleExam(){
//		
//	}
//	
	public capsuleExam(String test1){
		this.test1 = test1;
	}
	
	private void sick() {
		System.out.println("아파요");
	}
	
	public void test2() {
		System.out.println("호출 잘 돼?");
	}
	
	
	
	

	public static void main(String[] args) {
		
		capsuleExam ce = new capsuleExam("test");
		System.out.println(ce.test1);
		
		
		// TODO Auto-generated method stub
		// 캡슐화 == 일종의 검문소 
		// 중요한 데이터를 보존하고 보호하는 것
		// 연관있는 변수와 함수를 클래스로 묶는 작업
		// 주 목적은 데이터 변조 뿐만 아닌 데이터 보안을 위한 작업
		
		
		// 은닉화 
		// 객체에서 해당 속성을 직접 접근하지 못하게 하는 것
		//  (숨기는 것)
		// - private를 사용하여 처리 
		
		// 접근제어 지시자 
		// - 객체 지향 캡슐화를 구현하기 위해 자바에서 제공하는 키워드 
		// 	-클랙스, 메서드, 변수 등의 접근 범위를 지정
		
		// public, protected, default(package), private
		// private - 접근 범위가 클래스 내부로 제한
		// default - 접근 범위가 같은 패키기 내부로 제한
		// protected - 접근 범위가 같은 패키지 내부로 제한(?)
		//		-단 상속관계 일 경우 다른패키지라도 허용
		// public - project 내부라면 어디서든 접근 가능.
		
	
	
	}

}
