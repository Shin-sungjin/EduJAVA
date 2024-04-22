package Oop0109;

public class MethodExam2 {
	// Method 는 스택 영역에 저장
	// 스택 영역에 있는 애들은 호출할 때만 실행
	
	// Method의 종류 
	// 1. return 값이 있고 파라미터가 있는 Method
	
	// 리턴타입과 리턴값은 일치 해야한다. 
	// ex) return type = String ,  return value = String;

	 static String test1(int a){ //파라미터 명칭 선정 시 용도에 맞게끔 지정
		 return "군침이 싹도노";
	}
	
	// 2. return 값은 있으나 파라미터가 없는 Method
	 
	static String americano() {
		return "아메리카노 뽑는 중";
	}
	 
	// 3. return 값은 없으나 파라미터가 있는 Method
	static void gugu(int dan) {
		for(int i=1; i<=9; i++) {
			int num =  dan * i;
			System.out.println(dan + " * "+ i + " = " + num);
		}
	}
	 
	 
	// 4. return 값도 파라미터도 없는 Method
	static void test4() {
		System.out.println("군침 리턴 안됨.");
	}
	
	
	// 일반 Method vs 정적 Method;
	// 일반 Method - 해당 클래스를 기반으로 인스턴스를 생성 후 호출
	// 정적 Method - 클래스명.메서드명() 으로 호출
	
	//return 값이 있냐 없냐의 차이
	// -> 추후 가공이 가능하냐, 불가능하냐의 차이 
	
	
	public static void main(String[] args) {
		
		System.out.println(MethodExam2.test1(10));
		MethodExam2.gugu(4);
		MethodExam2.americano();
//		System.out.println(MethodExam2.test4());
	}
}
