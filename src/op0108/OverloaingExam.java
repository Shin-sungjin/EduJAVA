package op0108;

public class OverloaingExam {
	
	// 멤버 변수
	String test1;  //인스턴스
	int test2;	//인스턴스
	static boolean test3; 	//클래스 변수(정적변수)
	double test4;   //인스턴스 변수 
	int test5;
	
	// 생성자 오버로딩
	OverloaingExam() {   //일반적으로 생성자는 접근제어자 안씀
		
	}
	// 파라미터 개수가 다를경우 오버로딩 조건을 충족한다.
	OverloaingExam(String test1) {   //일반적으로 생성자는 접근제어자 안씀
		this.test1 = test1;
	}
	
	// 파라미터의 개수는 같지만 타입이 다를 경우도 조건을 충족한다. 
	OverloaingExam(int test2) {   //일반적으로 생성자는 접근제어자 안씀
		this.test2 = test2;
	}
	
	OverloaingExam(double test2) {   //일반적으로 생성자는 접근제어자 안씀
		this.test4 = test2;
	}
	
	//생성자 호출 시 정적변수(클래스변수)도 포함할 수 있으나, 의미 없음;
	OverloaingExam(boolean test3) {   //일반적으로 생성자는 접근제어자 안씀
		this.test3 = test3;
		
	}
	
	OverloaingExam(String test1, int test2 ) {   //일반적으로 생성자는 접근제어자 안씀
		this.test2 = test2;
		
	}
	
	// 변수명이 다른 경우는 허용 조건이 아님. 
//	OverloaingExam(String test1, int test5 ) {   //일반적으로 생성자는 접근제어자 안씀
//		this.test5 = test5;
//		
//	}
	
	public static void main(String[] args) {
		// 오버로딩
		// 메서드명은 같지만 다른 규칙을 두어 
		// 같은 이름의 메서드명을 허용하는 개념.
		// 이걸 왜씀?
		
		// 1. 생성자 오버로딩
		// 2. 매서드 오버로딩 
		
		// overLoding 을 충족하는 조건
		// 1.Method 명이 같아야 한다. 
		// 2.파라미터 개수가 다르거나  파라미터의 타입이 달라야 한다. 
		
		// overLoading 의 장점
		// 1. Method 호출하기 더 쉬워진다.
		// 	- 이름이 쉽다(네이밍 절약)
		//  	- 이름이 같으니 기능예측이 쉽다. 
		//  - 코드 보는게 편해진다(가독성의 증가)
		// 2. 데이터 변조 등 잘못 된 데이터의 출력을 방지 할 수 있다. 
		//  -파라미터 값이 다양하여 다양한 처리가 가능해진다. 
		
	}
}
